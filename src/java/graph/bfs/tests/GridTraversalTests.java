package graph.bfs.tests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import graph.bfs.GridTraversal;


public class GridTraversalTests {

    String[][] graph = {
            {"F", "C", null, "J"},
            {"B", "A", "D", null},
            {"G", "E", "H", "I"}
    };

    @Test                                               
    @DisplayName("successful graph traversal using breadth-first search")   
    public void successful_traversal() {
        var result = GridTraversal.traverse(graph, 1, 1);
        assertThat(result).containsExactly("A", "B", "C", "D", "E", "F", "G", "H", "I");
    }

    @Test
    @DisplayName("throws exception if the root vertex row is invalid")   
    public void exception_if_invalid_root_row() {
        assertThatThrownBy(() -> GridTraversal.traverse(graph, -1, 1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Invalid root vertex");
    }

    @Test
    @DisplayName("throws exception if the root vertex row is invalid")   
    public void exception_if_invalid_root_col() {
        assertThatThrownBy(() -> GridTraversal.traverse(graph, 1, -1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Invalid root vertex");
    }

    @Test
    @DisplayName("throws exception if the root vertex row is invalid")   
    public void exception_if_invalid_root() {
        assertThatThrownBy(() -> GridTraversal.traverse(graph, -1, -1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Invalid root vertex");
    }
}