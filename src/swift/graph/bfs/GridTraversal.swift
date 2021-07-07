typealias Graph<T> = [[T]]

// left, up, right, down
let directions = [(0, -1), (-1, 0), (0, 1), (1, 0)]


func traverse<T>(in graph: Graph<T?>, withRoot root: (row: Int, col: Int)) -> [T]? {
    let rows = graph.count
    let cols = rows > 0 ? graph[0].count : 0
    let rowBounds = 0..<rows
    let colBounds = 0..<cols
    guard rowBounds ~= root.row && colBounds ~= root.col else { 
        return nil 
    }

    var explored = Array(repeating: Array(repeating: false, count: cols), count: rows)
    var result = [T]()
    var queue = [root]
    var popIndex = 0

    while popIndex < queue.count {
        let (row, col) = queue[popIndex]
        popIndex += 1

        if let value = graph[row][col], !explored[row][col] {
            explored[row][col] = true
            result.append(value)

            for (dirRow, dirCol) in directions {
                let nextRow = row + dirRow
                let nextCol = col + dirCol

                if rowBounds ~= nextRow && colBounds ~= nextCol  {
                    queue.append((nextRow, nextCol))
                }
            }
        }
    }
    return result
}


func main() {
    let graph = [
        ["F", "C", nil, "J"],
        ["B", "A", "D", nil],
        ["G", "E", "H", "I"]      
    ]

    if let result = traverse(in: graph, withRoot: (1, 1)) {
        print(result) // ["A", "B", "C", "D", "E", "F", "G", "H", "I"]
    }
}