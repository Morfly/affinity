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

# ===== shortest path search =====

swift_binary(
    name = "search",
    srcs = [
        "ShortestPathSearch.swift",
        "main.swift",
    ]
)