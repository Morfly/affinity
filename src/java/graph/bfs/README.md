# Breadth-First Search

The **Breadth-First Search** (`BFS`) is an algorithm for traversing or searching tree or graph data structures. It explores all the vertices at the present depth before moving on to the vertices at the next depth level.

Available in:
[Java](../../../java/graph/bfs),
[Kotlin](../../../kotlin/graph/bfs),
[Python](../../../python/graph/bfs),
[Swift]("../../../swift/graph/bfs").

## How to run?

Open terminal and use the following commands:

```shell
bazelisk run src/java/bfs:traversal
```

```shell
bazelisk run src/java/bfs:traversal_grid
```

```shell
bazelisk run src/java/bfs:search
```

## The algorithm

### Time complexity
`O(V + E)` where `V` is number of vertices and `E` is number of edges.

### Space complexity
`O(V)` where `V` is number of vertices.