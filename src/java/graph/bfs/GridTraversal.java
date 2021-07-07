package graph.bfs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;


public class GridTraversal {

    // left, up, right, down
    private static int[] DIRECTIONS_ROWS = {0, -1, 0, 1};
    private static int[] DIRECTIONS_COLS = {-1, 0, 1, 0};


    public static <T> List<T> traverse(T[][] graph, int rootRow, int rootCol) {
        int rows = graph.length;
        int cols = rows > 0 ? graph[0].length : 0;

        if (rootRow < 0 || rootRow >= rows || rootCol < 0 || rootCol >= cols)
            throw new IllegalArgumentException("Invalid root vertex");

        var explored = new boolean[rows][cols];
        var result = new ArrayList<T>();
        var queue = new ArrayDeque<int[]>();

        int[] root = {rootRow, rootCol};
        queue.add(root);
        while (!queue.isEmpty()) {
            var vertex = queue.removeFirst();
            var row = vertex[0];
            var col = vertex[1];

            if (graph[row][col] != null && !explored[row][col]) {
                explored[row][col] = true;
                result.add(graph[row][col]);

                for (int i = 0; i < DIRECTIONS_ROWS.length; i++) {
                    int nextRow = row + DIRECTIONS_ROWS[i];
                    int nextCol = col + DIRECTIONS_COLS[i];

                    if (nextRow >= 0 && nextRow < rows && nextCol >= 0 && nextCol < cols) {
                        int[] next = {nextRow, nextCol};
                        queue.add(next);
                    }
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        String[][] graph = {
                {"F", "C", null, "J"},
                {"B", "A", "D", null},
                {"G", "E", "H", "I"}
        };

        var result = traverse(graph, 1, 1);

        System.out.println(result); // [A, B, C, D, E, F, G, H, I]
    }
}