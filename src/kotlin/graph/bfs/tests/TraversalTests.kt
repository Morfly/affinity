package graph.bfs.tests

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kotest.assertions.throwables.shouldThrowExactly
import graph.bfs.traverse


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

   test("successful graph traversal using breadth-first search") {
      val firstSubgraph = graph.traverse("A")
      firstSubgraph shouldBe listOf("A", "B", "C", "D", "E", "F", "G", "H", "I")

      val secondSubgraph = graph.traverse("J")
      secondSubgraph shouldBe listOf("J", "K", "L", "M", "N", "O")
   }

   test("throws exception if the root vertex is invalid") {
      shouldThrowExactly<IllegalArgumentException> {
         graph.traverse("InvalidVertex")
      }
   }
})