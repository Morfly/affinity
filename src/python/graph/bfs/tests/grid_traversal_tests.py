import sys
import pytest

from grid_traversal import traverse


graph = [
    ["F", "C", None, "J"],
    ["B", "ROOT", "D", None],
    ["G", "E", "H", "I"]
]


def test_successful_traversal():
    result = traverse(graph, root_row=1, root_col=1)
    assert result == ["ROOT", "B", "C", "D", "E", "F", "G", "H", "I"]


def test_empty_path_if_invalid_root_row():
    result = traverse(graph, root_row=-1, root_col=1)
    assert result == None

def test_empty_path_if_invalid_root_col():
    result = traverse(graph, root_row=1, root_col=-1)
    assert result == None

def test_empty_path_if_invalid_root():
    result = traverse(graph, root_row=-1, root_col=-1)
    assert result == None


if __name__ == "__main__":
    sys.exit(pytest.main([__file__]))