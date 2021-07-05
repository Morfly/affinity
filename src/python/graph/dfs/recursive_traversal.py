def traverse(graph, root):
    if root not in graph:
        return []

    explored = set()
    result = []

    def explore(vertex):
        explored.add(vertex)
        result.append(vertex)

        for successor in graph.get(vertex) or []:
            if successor not in explored:
                explore(successor)
    
    explore(root)

    # this implementation also explores disconnected subgraphs
    for vertex in graph:
        if vertex not in explored:
            explore(vertex)

    return result


def main():
    graph = {
        # first subgraph
        "A": ["B", "C", "D"],
        "B": ["E"],
        "C": ["F", "G"],
        "F": ["H", "I"],

        # second subgraph
        "J": ["K", "L", "M"],
        "L": ["N", "O"]
    }

    result = traverse(graph, "A")

    print(result) # ['A', 'B', 'E', 'C', 'F', 'H', 'I', 'G', 'D', 'J', 'K', 'L', 'N', 'O', 'M']


if __name__ == "__main__":
    main()