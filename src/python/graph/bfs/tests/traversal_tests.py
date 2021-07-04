import unittest

from traversal import traverse


class TraversalTests(unittest.TestCase):

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


    def test_successful_traversal(self):
        first_subgraph = traverse(self.graph, root="ROOT")
        self.assertEqual(first_subgraph, ["ROOT", "B", "C", "D", "E", "F", "G", "H", "I"])

        second_subgraph = traverse(self.graph, root="J")
        self.assertEqual(second_subgraph, ["J", "K", "L", "M", "N", "O"])


    def test_empty_path_if_invalid_root(self):
        result = traverse(self.graph, root="invalid_vertex")
        self.assertEqual(result, [])


if __name__ == '__main__':
    unittest.main()