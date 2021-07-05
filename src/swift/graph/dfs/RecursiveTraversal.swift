typealias Graph<T: Hashable> = [T: [T]]


func traverse<T>(in graph: Graph<T>, withRoot root: T) -> [T]? {
    guard graph[root] != nil else { return nil }

    var explored = Set<T>()
    var result = [T]()

    func explore(_ vertex: T) {
        explored.insert(vertex)
        result.append(vertex)

        for successor in graph[vertex, default: []] {
            if !explored.contains(successor) {
                explore(successor)
            }
        }
    }
    explore(root)

    // this implementation also explores disconnected subgraphs
    for (vertex, _) in graph {
        if !explored.contains(vertex) {
            explore(vertex)
        }
    }

    return result
}


func main() {
    let graph = [
        // first subgraph
        "A": ["B", "C", "D"],
        "B": ["E"],
        "C": ["F", "G"],
        "F": ["H", "I"],

        // second subgraph
        "J": ["K", "L", "M"],
        "L": ["N", "O"],       
    ]

    if let result = traverse(in: graph, withRoot: "A") {
        print(result) // ["A", "B", "E", "C", "F", "H", "I", "G", "D", .., .., .., .., .., ..]
    }
}