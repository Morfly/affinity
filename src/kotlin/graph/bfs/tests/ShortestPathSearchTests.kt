package graph.bfs.tests

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kotest.assertions.throwables.shouldThrowExactly
import io.kotest.matchers.collections.shouldBeEmpty
import graph.bfs.shortestPath


class ShortestPathSearchTests : FunSpec({

    val graph = mapOf(
        // first subgraph
        "A" to listOf("B", "C", "D"),
        "B" to listOf("E"),
        "D" to listOf("F", "G"),
        "C" to listOf("H", "E"),

        // second subgraph
        "J" to listOf("K", "L", "M"),
        "L" to listOf("N", "O")
    )

    test("successful search of the shortest path between the given vertices") {
        val path = graph.shortestPath("A", "E")
        path shouldBe listOf("A", "B", "E")
    }

    test("throws exception if the root vertex is invalid") {
        shouldThrowExactly<IllegalArgumentException> {
            graph.shortestPath("InvalidVertex", "E")
        }
    }

    test("path is empty if the root vertex is the same as the target") {
        val path = graph.shortestPath("A", "A")
        path.shouldBeEmpty()
    }

    test("path is empty if the root vertex is not connected with the target") {
        val path = graph.shortestPath("A", "J")
        path.shouldBeEmpty()
    }

    test("path is empty if the target vertex is invalid") {
        val path = graph.shortestPath("A", "InvalidVertex")
        path.shouldBeEmpty()
    }
})