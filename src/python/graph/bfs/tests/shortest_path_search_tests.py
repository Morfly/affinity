import sys
import pytest

from shortest_path_search import shortest_path


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


def test_successful_search():
    path = shortest_path(graph, root="ROOT", target="E")
    assert path == ["ROOT", "B", "E"]


def test_empty_path_if_invalid_root():
    path = shortest_path(graph, root="invalid_vertex", target="E")
    assert path == None


def test_empty_path_for_same_root_and_target():
    path = shortest_path(graph, root="ROOT", target="ROOT")
    assert path == []


def test_empty_path_for_dicsonnected_vertices():
    path = shortest_path(graph, root="ROOT", target="J")
    assert path == []


def test_empty_path_if_invalid_target():
    path = shortest_path(graph, root="ROOT", target="invalid_vertex")
    assert path == []


if __name__ == "__main__":
    sys.exit(pytest.main([__file__]))