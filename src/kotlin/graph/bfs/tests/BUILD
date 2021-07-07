load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kt_jvm_test")
load("@rules_jvm_external//:defs.bzl", "artifact")

test_suite(
    name = "tests",
    tags = ["small"]
)

# ===== traversal ======

kt_jvm_test(
    name = "traversal",
    size = "small",
    srcs = ["TraversalTests.kt"],
    main_class = "org.junit.platform.console.ConsoleLauncher",
    args = [
        "--select-package=graph.bfs.tests",
    ],
    deps = [
        "//src/kotlin/graph/bfs:traversal_lib",
        artifact("io.kotest:kotest-runner-junit5-jvm"),
        artifact("io.kotest:kotest-assertions-core-jvm"),
        artifact("org.junit.platform:junit-platform-console"),
    ],
)

# ===== grid traversal =====

kt_jvm_test(
    name = "traversal_grid",
    size = "small",
    srcs = ["GridTraversalTests.kt"],
    main_class = "org.junit.platform.console.ConsoleLauncher",
    args = [
        "--select-package=graph.bfs.tests",
    ],
    deps = [
        "//src/kotlin/graph/bfs:traversal_grid_lib",
        artifact("io.kotest:kotest-runner-junit5-jvm"),
        artifact("io.kotest:kotest-assertions-core-jvm"),
        artifact("org.junit.platform:junit-platform-console"),
    ],
)

# ===== shortest path search =====

kt_jvm_test(
    name = "search",
    size = "small",
    srcs = ["ShortestPathSearchTests.kt"],
    main_class = "org.junit.platform.console.ConsoleLauncher",
    args = [
        "--select-package=graph.bfs.tests",
    ],
    deps = [
        "//src/kotlin/graph/bfs:search_lib",
        artifact("io.kotest:kotest-runner-junit5-jvm"),
        artifact("io.kotest:kotest-assertions-core-jvm"),
        artifact("org.junit.platform:junit-platform-console"),
    ],
)