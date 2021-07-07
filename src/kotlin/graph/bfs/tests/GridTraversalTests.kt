package graph.bfs.tests

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kotest.assertions.throwables.shouldThrowExactly
import graph.bfs.traverse


class TraversalTests : FunSpec({

    val graph = arrayOf(
        arrayOf("F", "C", null, "J"),
        arrayOf("B", "A", "D", null),
        arrayOf("G", "E", "H", "I"),
    )

    test("successful grid graph traversal using breadth-first search") {
        val result = graph.traverse(rootRow = 1, rootCol = 1)
        result shouldBe listOf("A", "B", "C", "D", "E", "F", "G", "H", "I")
    }

    test("throws exception if the root vertex row is invalid") {
        shouldThrowExactly<IllegalArgumentException> {
            graph.traverse(rootRow = -1, rootCol = 1)
        }
    }

    test("throws exception if the root vertex column is invalid") {
        shouldThrowExactly<IllegalArgumentException> {
            graph.traverse(rootRow = 1, rootCol = -1)
        }
    }

    test("throws exception if the root vertex row column is invalid") {
        shouldThrowExactly<IllegalArgumentException> {
            graph.traverse(rootRow = -1, rootCol = -1)
        }
    }
})