from collections import deque


def shortest_path(graph, root, target):
    parents = {}
    queue = deque([root])

    while queue:
        vertex = queue.popleft()
        for successor in graph.get(vertex) or []:
            if successor not in parents:
                parents[successor] = vertex
                queue.append(successor)

                if successor == target:
                    return path_to(target, parents)
    
    return []


def path_to(target, parents):
    path = []
    vertex = target
    while vertex:
        path.append(vertex)
        vertex = parents.get(vertex)
    
    return path[::-1] # reversed


def main():
    graph = {
        "A": ["B", "C", "D"],
        "B": ["E"],
        "D": ["F", "G"],
        "C": ["H", "E"]
    }

    result = shortest_path(graph, "A", "E")

    print(result) # ['A', 'B', 'E']


if __name__ == "__main__":
    main()