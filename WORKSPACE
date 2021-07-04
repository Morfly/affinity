workspace(name = "affinity")

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

# ===== java rules =====

RULES_JAVA_VERSION = "4.0.0"
RULES_JAVA_SHA = "34b41ec683e67253043ab1a3d1e8b7c61e4e8edefbcad485381328c934d072fe"

http_archive(
    name = "rules_java",
    url = "https://github.com/bazelbuild/rules_java/releases/download/{v}/rules_java-{v}.tar.gz".format(v = RULES_JAVA_VERSION),
    sha256 = RULES_JAVA_SHA,
)

load("@rules_java//java:repositories.bzl", "rules_java_dependencies", "rules_java_toolchains")
rules_java_dependencies()
rules_java_toolchains()

# ===== kotlin rules =====

RULES_KOTLIN_VERSION = "v1.5.0-alpha-3"
RULES_KOTLIN_SHA = "eeae65f973b70896e474c57aa7681e444d7a5446d9ec0a59bb88c59fc263ff62"

http_archive(
   name = "io_bazel_rules_kotlin",
   sha256 = RULES_KOTLIN_SHA,
   type = "tar.gz",
   url = "https://github.com/bazelbuild/rules_kotlin/releases/download/%s/rules_kotlin_release.tgz" % RULES_KOTLIN_VERSION,
)

load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kotlin_repositories", "kt_register_toolchains")
kotlin_repositories()
kt_register_toolchains()

# ===== jvm external rules =====

RULES_JVM_EXTERNAL_VERSION = "4.1"
RULES_JVM_EXTERNAL_SHA = "f36441aa876c4f6427bfb2d1f2d723b48e9d930b62662bf723ddfb8fc80f0140"

http_archive(
    name = "rules_jvm_external",
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_VERSION,
    sha256 = RULES_JVM_EXTERNAL_SHA,
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_VERSION,
)

load("@rules_jvm_external//:defs.bzl", "maven_install") 

maven_install(
    artifacts = [
        "org.junit.jupiter:junit-jupiter-api:5.7.2",
        "org.junit.jupiter:junit-jupiter-engine:5.7.2",
        "org.junit.jupiter:junit-jupiter-params:5.7.2",
        "org.junit.platform:junit-platform-console:1.7.2",
        "org.assertj:assertj-core:3.20.2",
        "io.kotest:kotest-runner-junit5-jvm:4.6.0",
        "io.kotest:kotest-assertions-core-jvm:4.6.0",
    ],
    repositories = [
        "https://maven.google.com",
        "https://repo1.maven.org/maven2",
    ],
)

# ===== python rules =====

RULES_PYTHON_VERSION = "0.3.0"
RULES_PYTHON_SHA = "934c9ceb552e84577b0faf1e5a2f0450314985b4d8712b2b70717dc679fdc01b"

http_archive(
    name = "rules_python",
    url = "https://github.com/bazelbuild/rules_python/releases/download/{v}/rules_python-{v}.tar.gz".format(v = RULES_PYTHON_VERSION),
    sha256 = RULES_PYTHON_SHA,
)

load("@rules_python//python:pip.bzl", "pip_install")

pip_install(
    requirements = "//src/python:requirements.txt"
)

# ===== swift rules =====

RULES_SWIFT_VERSION = "0.23.0"
RULES_SWIFT_SHA = "f872c0388808c3f8de67e0c6d39b0beac4a65d7e07eff3ced123d0b102046fb6"

http_archive(
    name = "build_bazel_rules_swift",
    sha256 = RULES_SWIFT_SHA,
    url = "https://github.com/bazelbuild/rules_swift/releases/download/{v}/rules_swift.{v}.tar.gz".format(v = RULES_SWIFT_VERSION),
)

load("@build_bazel_rules_swift//swift:repositories.bzl", "swift_rules_dependencies")
swift_rules_dependencies()

load("@build_bazel_rules_swift//swift:extras.bzl", "swift_rules_extra_dependencies")
swift_rules_extra_dependencies()