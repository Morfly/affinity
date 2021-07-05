package graph.dfs.tests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import graph.dfs.IterativeTraversal;


public class IterativeTraversalTests {

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
    @DisplayName("successful graph traversal using depth-first search")   
    public void successful_traversal() {
        var result = IterativeTraversal.traverse(graph, "A");
        assertThat(result).containsExactly("A", "D", "C", "G", "F", "I", "H", "B", "E");
    }

    @Test
    @DisplayName("throws exception if the root vertex is invalid")   
    public void exception_if_invalid_root() {
        assertThatThrownBy(() -> IterativeTraversal.traverse(graph, "InvalidVertex"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Invalid root vertex");
    }
}