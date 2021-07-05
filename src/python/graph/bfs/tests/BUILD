load("@rules_python//python:defs.bzl", "py_test")
load("@pip//:requirements.bzl", "requirement")

test_suite(
    name = "tests",
    tags = ["small"]
)

# ===== traversal =====

py_test(
    name = "traversal",
    size = "small",
    srcs = ["traversal_tests.py"],
    main = "traversal_tests.py",
    imports = ["../"],
    deps = [
        "//src/python/graph/bfs:traversal",
        requirement("pytest"),
    ],
)

# ===== shortest path search =====

py_test(
    name = "shortest_path_search",
    size = "small",
    srcs = ["shortest_path_search_tests.py"],
    main = "shortest_path_search_tests.py",
    imports = ["../"],
    deps = [
        "//src/python/graph/bfs:search",
        requirement("pytest"),
    ],
)