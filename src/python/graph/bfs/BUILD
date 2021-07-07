load("@rules_python//python:defs.bzl", "py_binary")

package(default_visibility = ["__subpackages__"])

# ===== traversal =====

py_binary(
    name = "traversal",
    main = "traversal.py",
    srcs = ["traversal.py"],
)

# ===== grid traversal =====

py_binary(
    name = "traversal_grid",
    main = "grid_traversal.py",
    srcs = ["grid_traversal.py"],
)

alias(
    name = "grid_traversal",
    actual = ":traversal_grid",
)

# ===== shortest path search =====

py_binary(
    name = "search",
    main = "shortest_path_search.py",
    srcs = ["shortest_path_search.py"],
)