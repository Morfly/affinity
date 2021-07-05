load("@rules_python//python:defs.bzl", "py_binary")

package(default_visibility = ["__subpackages__"])

# ===== recursive traversal =====

py_binary(
    name = "traversal_recursive",
    main = "recursive_traversal.py",
    srcs = ["recursive_traversal.py"],
)

alias(
    name = "recursive_traversal",
    actual = ":traversal_recursive"
)

# ===== iterative traversal =====

py_binary(
    name = "traversal_iterative",
    main = "iterative_traversal.py",
    srcs = ["iterative_traversal.py"],
)

alias(
    name = "iterative_traversal",
    actual = ":traversal_iterative"
)