load("@rules_java//java:defs.bzl", "java_test")
load("@rules_jvm_external//:defs.bzl", "artifact")

java_test(
    name = "tests",
    size = "small",
    srcs = glob(["*.java"]),
    main_class = "org.junit.platform.console.ConsoleLauncher",
    args = [
        "--select-package=graph.bfs.tests",
    ],
    deps = [
        "//src/java/graph/bfs:traversal",
        "//src/java/graph/bfs:search",
        artifact("org.junit.jupiter:junit-jupiter-api"),
        artifact("org.junit.jupiter:junit-jupiter-engine"),
        artifact("org.junit.platform:junit-platform-console"),
        artifact("org.assertj:assertj-core"),
    ],
)