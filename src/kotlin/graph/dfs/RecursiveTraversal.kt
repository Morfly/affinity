package graph.dfs


typealias Graph<T> = Map<T, List<T>>


fun <T> Graph<T>.traverse(root: T): List<T> {
    val graph = this
    require(root in graph) { "Invalid root vertex '$root'" }

    val explored = linkedSetOf<T>()

    fun explore(vertex: T) {
        explored += vertex
        for (successor in graph[vertex].orEmpty()) {
            if (successor !in explored) {
                explore(successor)
            }
        }
    }
    explore(root)

    // this implementation also explores disconnected subgraphs
    for ((vertex, _) in graph) {
        if (vertex !in explored) {
            explore(vertex)
        }
    }
    
    return explored.toList()
}


fun main() {
    val graph = mapOf(
        // first subgraph
        "A" to listOf("B", "C", "D"),
        "B" to listOf("E"),
        "C" to listOf("F", "G"),
        "F" to listOf("H", "I"),

        // second subgraph
        "J" to listOf("K", "L", "M"),
        "L" to listOf("N", "O")
    )

    val result = graph.traverse(root = "A")

    println(result) // [A, B, E, C, F, H, I, G, D, J, K, L, N, O, M]
}