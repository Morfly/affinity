package graph.bfs;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class ShortestPathSearch {
    
    /**
     * Finds the shortest path between root and target vertices in the given graph.
     */
    public static <T> List<T> shortestPath(Map<T, List<T>> graph, T root, T target) {
        if (!graph.containsKey(root))
            throw new IllegalArgumentException("Invalid root vertex");

        var parents = new HashMap<T, T>();
        var queue = new ArrayDeque<T>();
        queue.add(root);

        while (!queue.isEmpty()) {
            var vertex = queue.removeFirst();
            for (var successor : graph.getOrDefault(vertex, List.of())) {
                if (!parents.containsKey(successor)) {
                    parents.put(successor, vertex);
                    queue.add(successor);

                    if (successor == target) return pathTo(target, parents);
                }
            }
        }
        return List.of();
    }

    /**
     * Builds the path from the root vertex from parents map to the target vertex.
     */
    private static <T> List<T> pathTo(T target, Map<T, T> parents) {
        var path = new LinkedList<T>();
        var vertex = target;

        while (vertex != null) {
            path.addFirst(vertex);
            vertex = parents.get(vertex);
        }
        return path;
    }


    public static void main(String[] args) {
        var graph = Map.of(
                "A", List.of("B", "C", "D"),
                "B", List.of("E"),
                "C", List.of("F", "G"),
                "F", List.of("H", "E")
        );

        var result = shortestPath(graph, "A", "E");

        System.out.println(result); // [A, B, E]
    }
}
