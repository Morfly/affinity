typealias Graph<T: Hashable> = [T: [T]]


func shortestPath<T>(in graph: Graph<T>, from root: T, to target: T) -> [T]? {
    guard graph[root] != nil else { return nil }

    var parents = [T: T]()
    var queue = [root]
    var popIndex = 0 // points to the most left item in queue

    while popIndex < queue.count {
        let vertex = queue[popIndex]
        popIndex += 1

        for successor in graph[vertex] ?? [] {
            if parents[successor] == nil {
                parents[successor] = vertex
                queue.append(successor)

                if successor == target {
                    return pathTo(target, from: parents)
                }
            }
        }
    }
    return []
}

private func pathTo<T>(_ target: T, from parents: [T: T]) -> [T] {
    var path = [target]
    while let vertex = parents[path.last!] {
        path.append(vertex)
    }
    return path.reversed()
}


func main() {
    let graph = [
        "A": ["B", "C", "D"],
        "B": ["E"],
        "C": ["F", "G"],
        "F": ["H", "E"],     
    ]

    if let result = shortestPath(in: graph, from: "A", to: "E") {
        print(result) // ["A", "B", "E"]
    }
}