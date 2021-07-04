load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kt_jvm_test")
load("@rules_jvm_external//:defs.bzl", "artifact")

kt_jvm_test(
    name = "tests",
    size = "small",
    srcs = glob(["*.kt"]),
    main_class = "org.junit.platform.console.ConsoleLauncher",
    args = [
        "--select-package=graph.bfs.tests",
    ],
    deps = [
        "//src/kotlin/graph/bfs:traversal_lib",
        "//src/kotlin/graph/bfs:search_lib",
        artifact("io.kotest:kotest-runner-junit5-jvm"),
        artifact("io.kotest:kotest-assertions-core-jvm"),
        artifact("org.junit.platform:junit-platform-console"),
    ],
)