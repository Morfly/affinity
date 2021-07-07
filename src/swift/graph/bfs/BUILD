load("@build_bazel_rules_swift//swift:swift.bzl", "swift_binary")

exports_files(
    glob(["*.swift"]), 
    visibility = ["__subpackages__"]
)

# ===== traversal =====

swift_binary(
    name = "traversal",
    srcs = [
        "Traversal.swift",
        "main.swift",
    ]
)

# ===== grid traversal =====

swift_binary(
    name = "traversal_grid",
    srcs = [
        "GridTraversal.swift",
        "main.swift",
    ]
)

alias(
    name = "grid_traversal",
    actual = ":traversal_grid",
)

# ===== shortest path search =====

swift_binary(
    name = "search",
    srcs = [
        "ShortestPathSearch.swift",
        "main.swift",
    ]
)