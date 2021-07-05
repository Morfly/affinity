package graph.dfs


typealias Graph<T> = Map<T, List<T>>

typealias Stack<T> = ArrayDeque<T>


fun <T> Graph<T>.traverse(root: T): List<T> {
    val graph = this
    require(root in graph) { "Invalid root vertex '$root'" }

    val explored = linkedSetOf<T>()
    val stack = Stack<T>()
    stack += root

    while (stack.isNotEmpty()) {
        val vertex = stack.removeLast()
        if (vertex !in explored) {
            explored += vertex
            stack += graph[vertex].orEmpty()
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

    println(result) // [A, D, C, G, F, I, H, B, E]
}