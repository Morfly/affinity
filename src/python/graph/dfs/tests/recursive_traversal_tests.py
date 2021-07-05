import sys
import pytest

from recursive_traversal import traverse


graph = {
    # first subgraph
    "ROOT": ["B", "C", "D"],
    "B": ["E"],
    "C": ["F", "G"],
    "F": ["H", "I"],

    # second subgraph
    "J": ["K", "L", "M"],
    "L": ["N", "O"]
}


def test_successful_traversal():
    result = traverse(graph, root="ROOT")
    assert result == ['ROOT', 'B', 'E', 'C', 'F', 'H', 'I', 'G', 'D', 'J', 'K', 'L', 'N', 'O', 'M']


def test_empty_path_if_invalid_root():
    result = traverse(graph, root="invalid_vertex")
    assert result == []


if __name__ == "__main__":
    sys.exit(pytest.main([__file__]))