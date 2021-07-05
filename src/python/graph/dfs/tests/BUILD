load("@rules_python//python:defs.bzl", "py_test")
load("@pip//:requirements.bzl", "requirement")

test_suite(
    name = "tests",
    tags = ["small"],
)

# ===== recursive traversal =====

py_test(
    name = "traversal_recursive",
    size = "small",
    srcs = ["recursive_traversal_tests.py"],
    main = "recursive_traversal_tests.py",
    imports = ["../"],
    deps = [
        "//src/python/graph/dfs:traversal_recursive",
        requirement("pytest"),
    ],
)

# ===== iterative traversal =====

py_test(
    name = "traversal_iterative",
    size = "small",
    srcs = ["iterative_traversal_tests.py"],
    main = "iterative_traversal_tests.py",
    imports = ["../"],
    deps = [
        "//src/python/graph/dfs:traversal_iterative",
        requirement("pytest"),
    ],
)