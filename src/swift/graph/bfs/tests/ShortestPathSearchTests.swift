import XCTest


class ShortestPathSearchTests: XCTestCase {

    let graph = [
        // first subgraph
        "A": ["B", "C", "D"],
        "B": ["E"],
        "C": ["F", "G"],
        "F": ["H", "E"],

        // second subgraph
        "J": ["K", "L", "M"],
        "L": ["N", "O"],   
    ]


    func test_successful_search() {
        let path = shortestPath(in: graph, from: "A", to: "E") 
        XCTAssertEqual(path, ["A", "B", "E"])
    }

    func test_nil_if_invalid_root() {
        let path = shortestPath(in: graph, from: "InvalidVertex", to: "E") 
        XCTAssertNil(path)
    }

    func test_empty_path_for_same_root_and_target() {
        let path = shortestPath(in: graph, from: "A", to: "A") 
        XCTAssertTrue(path!.isEmpty)
    }

    func test_empty_path_for_dicsonnected_vertices() {
        let path = shortestPath(in: graph, from: "A", to: "J") 
        XCTAssertTrue(path!.isEmpty)
    }

    func test_empty_path_if_invalid_target() {
        let path = shortestPath(in: graph, from: "A", to: "InvalidVertex") 
        XCTAssertTrue(path!.isEmpty)
    }


    static var allTests = [
        ("test_successful_search", test_successful_search),
        ("test_nil_if_invalid_root", test_nil_if_invalid_root),
        ("test_empty_path_for_same_root_and_target", test_empty_path_for_same_root_and_target),
        ("test_empty_path_for_dicsonnected_vertices", test_empty_path_for_dicsonnected_vertices),
        ("test_empty_path_if_invalid_target", test_empty_path_if_invalid_target),
    ]
}


func testMain() {
    #if os(Linux)

    XCTMain([
        testCase(ShortestPathSearchTests.allTests)
    ])
    #endif
}