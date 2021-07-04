package graph.bfs.tests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import graph.bfs.ShortestPathSearch;


public class ShortestPathSearchTests {

    private Map<String, List<String>> graph = Map.of(
            // first subgraph
            "A", List.of("B", "C", "D"),
            "B", List.of("E"),
            "C", List.of("F", "G"),
            "F", List.of("H", "E"),

            // second subgraph
            "J", List.of("K", "L", "M"),
            "L", List.of("N", "O")
    );
    
    @Test                                               
    @DisplayName("successful search of the shortest path between the given vertices")   
    public void successful_search() {
        var path = ShortestPathSearch.shortestPath(graph, "A", "E"); 
        assertThat(path).containsExactly("A", "B", "E");
    }

    @Test
    @DisplayName("throws exception if the root vertex is invalid")   
    public void exception_if_invalid_root() {
        assertThatThrownBy(() -> ShortestPathSearch.shortestPath(graph, "InvalidVertex", "E"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Invalid root vertex");
    }

    @Test
    @DisplayName("path is empty if the root vertex is the same as the target")   
    public void empty_path_for_same_root_and_target() {
        var path = ShortestPathSearch.shortestPath(graph, "A", "A"); 
        assertThat(path).isEmpty();
    }

    @Test
    @DisplayName("path is empty if the root vertex is not connected with the target")   
    public void empty_path_for_dicsonnected_vertices() {
        var path = ShortestPathSearch.shortestPath(graph, "A", "J"); 
        assertThat(path).isEmpty();
    }

    @Test
    @DisplayName("path is empty if the target vertex is invalid")   
    public void empty_path_if_invalid_target() {
        var path = ShortestPathSearch.shortestPath(graph, "A", "InvalidVertex"); 
        assertThat(path).isEmpty();
    }
}
