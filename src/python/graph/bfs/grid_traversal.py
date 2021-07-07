from collections import deque


# left, up, right, down
directions = [(0, -1), (-1, 0), (0, 1), (1, 0)]


def traverse(graph, root_row, root_col):
    rows = len(graph)
    cols = len(graph[0]) if graph[0:] else 0

    if (root_row not in range(rows) or root_col not in range(cols)):
        return None

    explored = [[False for j in range(cols)] for i in range(rows)]
    result = []
    queue = deque()
    queue.append((root_row, root_col))

    while queue:
        row, col = queue.popleft()

        if graph[row][col] and not explored[row][col]:
            explored[row][col] = True
            result.append(graph[row][col])

            for dir_row, dir_col in directions:
                next_row = row + dir_row
                next_col = col + dir_col

                if next_row in range(rows) and next_col in range(cols):
                    queue.append((next_row, next_col))

    return result


def main():
    graph = [
        ["F", "C", None, "J"],
        ["B", "A", "D", None],
        ["G", "E", "H", "I"]
    ]

    result = traverse(graph, root_row=1, root_col=1)

    print(result) # ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I']


if __name__ == "__main__":
    main()