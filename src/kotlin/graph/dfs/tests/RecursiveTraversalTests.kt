package graph.dfs.tests

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kotest.assertions.throwables.shouldThrowExactly
import graph.dfs.traverse


class TraversalTests : FunSpec({

    val graph = mapOf(
        // first subgraph
        "A" to listOf("B", "C", "D"),
        "B" to listOf("E"),
        "C" to listOf("F", "G"),
        "F" to listOf("H", "I"),

        // second subgraph
        "J" to listOf("K", "L", "M"),
        "L" to listOf("N", "O")
    )

    test("successful graph traversal using depth-first search") {
        val result = graph.traverse("A")
        result shouldBe listOf("A", "B", "E", "C", "F", "H", "I", "G", "D", "J", "K", "L", "N", "O", "M")
    }

    test("throws exception if the root vertex is invalid") {
        shouldThrowExactly<IllegalArgumentException> {
            graph.traverse("InvalidVertex")
        }
    }
})