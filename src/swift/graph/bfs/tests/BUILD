load("@build_bazel_rules_swift//swift:swift.bzl", "swift_test")

test_suite(
    name = "tests",
    tags = ["small"]
)

# ===== traversal =====

swift_test(
    name = "traversal",
    size = "small",
    srcs = [
        "TraversalTests.swift",
        "//src/swift/graph/bfs:Traversal.swift",
        "main.swift",
    ]
)

# ===== shortest path search =====

swift_test(
    name = "search",
    size = "small",
    srcs = [
        "ShortestPathSearchTests.swift",
        "//src/swift/graph/bfs:ShortestPathSearch.swift",
        "main.swift",
    ]
)