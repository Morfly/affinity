from collections import deque


def traverse(graph, root):
    if root not in graph:
        return []

    explored = set()
    result = []
    queue = deque([root])

    while queue:
        vertex = queue.popleft()
        if vertex not in explored:
            explored.add(vertex)
            result.append(vertex)
            queue += graph.get(vertex) or []

    return result


def main():
    graph = {
        "A": ["B", "C", "D"],
        "B": ["E"],
        "C": ["F", "G"],
        "F": ["H", "I"],

        "J": ["K", "L", "M"],
        "L": ["N", "O"]
    }

    result = traverse(graph, "A")

    print(result) # ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I']


if __name__ == "__main__":
    main()