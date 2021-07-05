typealias Graph<T: Hashable> = [T: [T]]


func traverse<T>(in graph: Graph<T>, withRoot root: T) -> [T]? {
    guard graph[root] != nil else { return nil }

    var explored = Set<T>()
    var result = [T]()
    var stack = [root]

    while !stack.isEmpty {
        let vertex = stack.removeLast()

        if !explored.contains(vertex) {
            explored.insert(vertex)
            result.append(vertex)

            if let successors = graph[vertex] {
                stack += successors
            }
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
        print(result) // ["A", "D", "C", "G", "F", "I", "H", "B", "E"]
    }
}