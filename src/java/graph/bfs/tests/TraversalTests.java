package graph.bfs.tests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import graph.bfs.Traversal;


public class TraversalTests {

    private Map<String, List<String>> graph = Map.of(
            // first subgraph
            "A", List.of("B", "C", "D"),
            "B", List.of("E"),
            "C", List.of("F", "G"),
            "F", List.of("H", "I"),

            // second subgraph
            "J", List.of("K", "L", "M"),
            "L", List.of("N", "O")
    );

    @Test                                               
    @DisplayName("successful graph traversal using breadth-first search")   
    public void successful_traversal() {
        var firstSubgraph = Traversal.traverse(graph, "A");
        assertThat(firstSubgraph).containsExactly("A", "B", "C", "D", "E", "F", "G", "H", "I");

        var secondSubgraph = Traversal.traverse(graph, "J");
        assertThat(secondSubgraph).containsExactly("J", "K", "L", "M", "N", "O");
    }

    @Test
    @DisplayName("throws exception if the root vertex is invalid")   
    public void exception_if_invalid_root() {
        assertThatThrownBy(() -> Traversal.traverse(graph, "InvalidVertex"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Invalid root vertex");
    }
}