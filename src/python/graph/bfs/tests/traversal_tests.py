import sys
import pytest

from traversal import traverse


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
    first_subgraph = traverse(graph, root="ROOT")
    assert first_subgraph == ["ROOT", "B", "C", "D", "E", "F", "G", "H", "I"]

    second_subgraph = traverse(graph, root="J")
    assert second_subgraph == ["J", "K", "L", "M", "N", "O"]


def test_empty_path_if_invalid_root():
    result = traverse(graph, root="invalid_vertex")
    assert result == None


if __name__ == "__main__":
    sys.exit(pytest.main([__file__]))