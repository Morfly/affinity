# Affinity
A collection of `algorithms` and `data structures` written in your favorite programming language.

Available in: 
[Java](src/java),
[Kotlin](src/kotlin),
[Python](src/python),
[Swift](src/swift).

## Algorithms
In mathematics and computer science, an algorithm is a finite sequence of well-defined, computer-implementable instructions, typically to solve a class of specific problems or to perform a computation.

- **Graph**
    - [Breadth-first search](src/kotlin/graph/bfs)
    - [Depth-first search](src/kotlin/graph/dfs)
    - Dijkstra's algorithm
    - Topological sort

## How to run?
This repository uses [Bazel](https://bazel.build/) build system to run the code.

It is recommended to use [Bazelisk](https://github.com/bazelbuild/bazelisk), a user-friendly launcher for Bazel, to build and run the code.

#### Install with `brew` on MacOS
```shell
brew install bazelisk
```
#### Install with `npm`
```shell
npm install -g @bazel/bazelisk
```
#### Install with `go`
```shell
go get github.com/bazelbuild/bazelisk
```

Now, the boring stuff is done and the project is ready for work.


#### Run the code
In order to run the desired algorithm or data structure select a corresponding directory and use the unique `label`:
```shell
bazelisk run //src/kotlin/graph/bfs:traversal
```

#### Run tests
You can run all tests for the language:
```shell
bazelisk test //src/kotlin/...
```
Or run tests for the specific algorithm of data structure:
```shell
bazelisk test //src/kotlin/graph/bfs/tests
```