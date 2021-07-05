load("@rules_java//java:defs.bzl", "java_test")
load("@rules_jvm_external//:defs.bzl", "artifact")

java_test(
    name = "tests",
    size = "small",
    srcs = glob(["*.java"]),
    main_class = "org.junit.platform.console.ConsoleLauncher",
    args = [
        "--select-package=graph.dfs.tests",
    ],
    deps = [
        "//src/java/graph/dfs:traversal_recursive",
        "//src/java/graph/dfs:traversal_iterative",
        artifact("org.junit.jupiter:junit-jupiter-api"),
        artifact("org.junit.platform:junit-platform-console"),
        artifact("org.assertj:assertj-core"),
    ],
    runtime_deps = [
        artifact("org.junit.jupiter:junit-jupiter-engine"),
    ]
)