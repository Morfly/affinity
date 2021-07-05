load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kt_jvm_test")
load("@rules_jvm_external//:defs.bzl", "artifact")

test_suite(
    name = "tests",
    tags = ["small"]
)

# ===== recursive traversal =====

kt_jvm_test(
    name = "traversal_recursive",
    size = "small",
    srcs = ["RecursiveTraversalTests.kt"],
    main_class = "org.junit.platform.console.ConsoleLauncher",
    args = [
        "--select-package=graph.dfs.tests",
    ],
    deps = [
        "//src/kotlin/graph/dfs:traversal_recursive_lib",
        artifact("io.kotest:kotest-runner-junit5-jvm"),
        artifact("io.kotest:kotest-assertions-core-jvm"),
        artifact("org.junit.platform:junit-platform-console"),
    ],
)

# ===== iterative traversal =====

kt_jvm_test(
    name = "traversal_iterative",
    size = "small",
    srcs = ["IterativeTraversalTests.kt"],
    main_class = "org.junit.platform.console.ConsoleLauncher",
    args = [
        "--select-package=graph.dfs.tests",
    ],
    deps = [
        "//src/kotlin/graph/dfs:traversal_iterative_lib",
        artifact("io.kotest:kotest-runner-junit5-jvm"),
        artifact("io.kotest:kotest-assertions-core-jvm"),
        artifact("org.junit.platform:junit-platform-console"),
    ],
)