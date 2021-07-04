import unittest

from shortest_path_search import shortest_path


class ShortestPathSearchTests(unittest.TestCase):

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


    def test_successful_search(self):
        path = shortest_path(self.graph, root="ROOT", target="E")
        self.assertEqual(path, ["ROOT", "B", "E"])


    def test_empty_path_if_invalid_root(self):
        path = shortest_path(self.graph, root="invalid_vertex", target="E")
        self.assertEqual(path, [])


    def test_empty_path_for_same_root_and_target(self):
        path = shortest_path(self.graph, root="ROOT", target="ROOT")
        self.assertEqual(path, [])


    def test_empty_path_for_dicsonnected_vertices(self):
        path = shortest_path(self.graph, root="ROOT", target="J")
        self.assertEqual(path, [])


    def test_empty_path_if_invalid_target(self):
        path = shortest_path(self.graph, root="ROOT", target="invalid_vertex")
        self.assertEqual(path, [])


if __name__ == '__main__':
    unittest.main()