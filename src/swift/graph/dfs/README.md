# Depth-First Search

The **Depth-First Search** (`DFS`) is an algorithm for traversing or searching tree or graph data structures which uses the idea of backtracking. It explores all the nodes by going forward if possible or uses backtracking.

Available in:
[Java](../../../java/graph/dfs),
[Kotlin](../../../kotlin/graph/dfs),
[Python](../../../python/graph/dfs),
[Swift]("../../../swift/graph/dfs").

## How to run?

Open terminal and use the following commands:

```shell
bazelisk run src/swift/dfs:traversal_recursive
```

```shell
bazelisk run src/swift/dfs:search_iterative
```

## The algorithm

### Time complexity
`O(V + E)` where `V` is number of vertices and `E` is number of edges.

### Space complexity
`O(V)` where `V` is number of vertices.