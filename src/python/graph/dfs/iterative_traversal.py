from collections import deque


def traverse(graph, root):
    if root not in graph:
        return []

    explored = set()
    result = []
    stack = deque([root])

    while stack:
        vertex = stack.pop()
        if vertex not in explored:
            explored.add(vertex)
            result.append(vertex)
            stack += graph.get(vertex) or []

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

    print(result) # ['A', 'D', 'C', 'G', 'F', 'I', 'H', 'B', 'E']


if __name__ == "__main__":
    main()