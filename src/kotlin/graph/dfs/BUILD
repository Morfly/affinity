load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kt_jvm_library")
load("@rules_java//java:defs.bzl", "java_binary")

package(default_visibility = ["__subpackages__"])

# ===== recursive traversal =====

kt_jvm_library(
    name = "traversal_recursive_lib",
    srcs = ["RecursiveTraversal.kt"]
)

java_binary(
    name = "traversal_recursive",
    main_class = "graph.dfs.RecursiveTraversalKt",
    runtime_deps = [":traversal_recursive_lib"],
)

alias(
    name = "recursive_traversal",
    actual = ":traversal_recursive",
)

# ===== iterative traversal =====

kt_jvm_library(
    name = "traversal_iterative_lib",
    srcs = ["IterativeTraversal.kt"]
)

java_binary(
    name = "traversal_iterative",
    main_class = "graph.dfs.IterativeTraversalKt",
    runtime_deps = [":traversal_iterative_lib"],
)

alias(
    name = "iterative_traversal",
    actual = ":traversal_iterative",
)