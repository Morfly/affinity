import XCTest


class RecursiveTraversalTests: XCTestCase {

    let graph = [
        // first subgraph
        "A": ["B", "C", "D"],
        "B": ["E"],
        "C": ["F", "G"],
        "F": ["H", "I"],

        // second subgraph
        "J": ["K", "L", "M"],
        "L": ["N", "O"],       
    ]


    func test_successful_traversal() {
        let result = traverse(in: graph, withRoot: "A")
        // XCTAssertEqual(result, ["A", "B", "E", "C", "F", "H", "I", "G", "D", "J", "K", "L", "N", "O", "M"])
        XCTAssertTrue(result!.starts(with: ["A", "B", "E", "C", "F", "H", "I", "G", "D"]))
        XCTAssertEqual(result!.count, 15)
    }

    func test_nil_if_invalid_root() {
        let result = traverse(in: graph, withRoot: "InvalidVertex")
        XCTAssertNil(result)
    }


    static var allTests = [
        ("test_successful_traversal", test_successful_traversal),
        ("test_nil_if_invalid_root", test_nil_if_invalid_root),
    ]
}