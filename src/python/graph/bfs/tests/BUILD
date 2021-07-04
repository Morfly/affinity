load("@rules_python//python:defs.bzl", "py_test")
load("@pip//:requirements.bzl", "requirement")

test_suite(
    name = "tests",
    tags = ["small"]
)

# ===== traversal =====

py_test(
    name = "traversal_tests",
    size = "small",
    srcs = ["traversal_tests.py"],
    imports = ["../"],
    deps = [
        "//src/python/graph/bfs:traversal",
    ],
)

py_test(
    name = "traversal_pytests",
    size = "small",
    srcs = ["traversal_pytests.py"],
    imports = ["../"],
    deps = [
        "//src/python/graph/bfs:traversal",
        requirement("pytest"),
    ],
)

# ===== shortest path search =====

py_test(
    name = "shortest_path_search_tests",
    size = "small",
    srcs = ["shortest_path_search_tests.py"],
    imports = ["../"],
    deps = [
        "//src/python/graph/bfs:search",
    ],
)

py_test(
    name = "shortest_path_search_pytests",
    size = "small",
    srcs = ["shortest_path_search_pytests.py"],
    imports = ["../"],
    deps = [
        "//src/python/graph/bfs:search",
        requirement("pytest"),
    ],
)