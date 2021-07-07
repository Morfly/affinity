load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kt_jvm_library")
load("@rules_java//java:defs.bzl", "java_binary")

package(default_visibility = ["__subpackages__"])

# ===== traversal =====

kt_jvm_library(
    name = "traversal_lib",
    srcs = ["Traversal.kt"]
)

java_binary(
    name = "traversal",
    main_class = "graph.bfs.TraversalKt",
    runtime_deps = [":traversal_lib"],
)

# ===== grid traversal =====

kt_jvm_library(
    name = "traversal_grid_lib",
    srcs = ["GridTraversal.kt"]
)

java_binary(
    name = "traversal_grid",
    main_class = "graph.bfs.GridTraversalKt",
    runtime_deps = [":traversal_grid_lib"],
)

alias(
    name = "grid_traversal",
    actual = ":traversal_grid"
)

# ===== shortest path search =====

kt_jvm_library(
    name = "search_lib",
    srcs = ["ShortestPathSearch.kt"]
)

java_binary(
    name = "search",
    main_class = "graph.bfs.ShortestPathSearchKt",
    runtime_deps = [":search_lib"],
)