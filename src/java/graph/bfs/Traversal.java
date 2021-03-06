package graph.bfs;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;


public class Traversal {

    public static <T> List<T> traverse(Map<T, List<T>> graph, T root) {
        if (!graph.containsKey(root))
            throw new IllegalArgumentException("Invalid root vertex");

        var explored = new LinkedHashSet<T>();
        var queue = new ArrayDeque<T>();
        queue.add(root);

        while (!queue.isEmpty()) {
            var vertex = queue.removeFirst();
            if (!explored.contains(vertex)) {
                explored.add(vertex);
                queue.addAll(graph.getOrDefault(vertex, List.of()));
            }
        }
        
        return List.copyOf(explored);
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

        System.out.println(result); // [A, B, C, D, E, F, G, H, I]
    }
}