load("@rules_java//java:defs.bzl", "java_binary")

package(default_visibility = ["__subpackages__"])

# ===== traversal =====

java_binary(
    name = "traversal",
    main_class = "graph.bfs.Traversal",
    srcs = ["Traversal.java"],
)

# ===== traversal_grid =====

java_binary(
    name = "traversal_grid",
    main_class = "graph.bfs.GridTraversal",
    srcs = ["GridTraversal.java"],
)

alias(
    name = "grid_traversal",
    actual = "traversal_grid",
)

# ====== shortest path search =====

java_binary(
    name = "search",
    main_class = "graph.bfs.ShortestPathSearch",
    srcs = ["ShortestPathSearch.java"],
)