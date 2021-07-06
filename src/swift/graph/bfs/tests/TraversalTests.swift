import XCTest


class TraversalTests: XCTestCase {

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
        let firstSubgraph = traverse(in: graph, withRoot: "A")
        XCTAssertEqual(firstSubgraph, ["A", "B", "C", "D", "E", "F", "G", "H", "I"])

        let secondSubgraph = traverse(in: graph, withRoot: "J")
        XCTAssertEqual(secondSubgraph, ["J", "K", "L", "M", "N", "O"])
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


func testMain() {
    #if os(Linux)

    XCTMain([
        testCase(TraversalTests.allTests)
    ])
    #endif
}