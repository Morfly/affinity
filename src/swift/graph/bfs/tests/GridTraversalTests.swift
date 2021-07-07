import XCTest


class GridTraversalTests: XCTestCase {

    let graph = [
        ["F", "C", nil, "J"],
        ["B", "A", "D", nil],
        ["G", "E", "H", "I"]      
    ]


    func test_successful_traversal() {
        let result = traverse(in: graph, withRoot: (1, 1))
        XCTAssertEqual(result, ["A", "B", "C", "D", "E", "F", "G", "H", "I"])
    }

    func test_nil_if_invalid_root_row() {
        let result = traverse(in: graph, withRoot: (-1, 1))
        XCTAssertNil(result)
    }

    func test_nil_if_invalid_root_col() {
        let result = traverse(in: graph, withRoot: (1, -1))
        XCTAssertNil(result)
    }

    func test_nil_if_invalid_root() {
        let result = traverse(in: graph, withRoot: (-1, -1))
        XCTAssertNil(result)
    }


    static var allTests = [
        ("test_successful_traversal", test_successful_traversal),
        ("test_nil_if_invalid_root_row", test_nil_if_invalid_root_row),
        ("test_nil_if_invalid_root_col", test_nil_if_invalid_root_col),
        ("test_nil_if_invalid_root", test_nil_if_invalid_root),
    ]
}


func testMain() {
    #if os(Linux)

    XCTMain([
        testCase(GridTraversalTests.allTests)
    ])
    #endif
}