typealias Graph<T: Hashable> = [T: [T]]


func traverse<T>(in graph: Graph<T>, withRoot root: T) -> [T]? {
    guard graph[root] != nil else { return nil }

    var explored = Set<T>()
    var queue = [root]
    var popIndex = 0 // points to the most left item in queue

    while popIndex < queue.count {
        let vertex = queue[popIndex]
        popIndex += 1

        if !explored.contains(vertex) {
            explored.insert(vertex)
            if let successors = graph[vertex] {
                queue += successors
            }
        }
    }
    return queue
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
        print(result) // ["A", "B", "C", "D", "E", "F", "G", "H", "I"]
    }
}