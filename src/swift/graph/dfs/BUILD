load("@build_bazel_rules_swift//swift:swift.bzl", "swift_binary")

exports_files(
    glob(["*.swift"]), 
    visibility = ["__subpackages__"]
)

# ===== recursive traversal =====

swift_binary(
    name = "traversal_recursive",
    srcs = [
        "RecursiveTraversal.swift",
        "main.swift",
    ]
)

alias(
    name = "recursive_traversal",
    actual = ":traversal_recursive",
)

# ===== iterative traversal =====

swift_binary(
    name = "traversal_iterative",
    srcs = [
        "IterativeTraversal.swift",
        "main.swift",
    ]
)

alias(
    name = "iterative_traversal",
    actual = ":traversal_iterative",
)