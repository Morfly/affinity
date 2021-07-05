package graph.dfs;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class RecursiveTraversal {

    public static <T> List<T> traverse(Map<T, List<T>> graph, T root) {
        if (!graph.containsKey(root))
            throw new IllegalArgumentException("Invalid root vertex");

        var explored = new LinkedHashSet<T>();
        
        explore(root, graph, explored);

        // this implementation also explores disconnected subgraphs
        for (var vertex : graph.keySet()) {
            if (!explored.contains(explored)) {
                explore(vertex, graph, explored);
            }
        }

        return List.copyOf(explored);
    }

    private static <T> void explore(T vertex, Map<T, List<T>> graph, Set<T> explored) {
        explored.add(vertex);
        for (var successor : graph.getOrDefault(vertex, List.of())) {
            if (!explored.contains(successor)) {
                explore(successor, graph, explored);
            }
        }
    }


    public static void main(String[] args) {
        var graph = Map.of(
                // first subgraph
                "A", List.of("B", "C", "D"),
                "B", List.of("E"),
                "C", List.of("F", "G"),
                "F", List.of("H", "I"),

                // second subgraph
                "J", List.of("K", "L", "M"),
                "L", List.of("N", "O")
        );

        var result = traverse(graph, "A");

        System.out.println(result); // [A, B, E, C, F, H, I, G, D, .., .., .., .., .., ..]
    }
}