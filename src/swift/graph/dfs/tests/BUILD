load("@build_bazel_rules_swift//swift:swift.bzl", "swift_test")

test_suite(
    name = "tests",
    tags = ["small"]
)

# ===== recursive traversal =====

swift_test(
    name = "traversal_recursive",
    size = "small",
    srcs = [
        "RecursiveTraversalTests.swift",
        "//src/swift/graph/dfs:RecursiveTraversal.swift",
        "main.swift",
    ]
)

# ===== iterative traversal =====

swift_test(
    name = "traversal_iterative",
    size = "small",
    srcs = [
        "IterativeTraversalTests.swift",
        "//src/swift/graph/dfs:IterativeTraversal.swift",
        "main.swift",
    ]
)