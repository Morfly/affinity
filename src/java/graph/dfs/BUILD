load("@rules_java//java:defs.bzl", "java_binary")

package(default_visibility = ["__subpackages__"])

# ===== recursive traversal =====

java_binary(
    name = "traversal_recursive",
    main_class = "graph.dfs.RecursiveTraversal",
    srcs = ["RecursiveTraversal.java"],
)

alias(
    name = "recursive_traversal",
    actual = ":traversal_recursive",
)

# ===== iterative traversal =====

java_binary(
    name = "traversal_iterative",
    main_class = "graph.dfs.IterativeTraversal",
    srcs = ["IterativeTraversal.java"],
)

alias(
    name = "iterative_traversal",
    actual = ":traversal_recursive",
)