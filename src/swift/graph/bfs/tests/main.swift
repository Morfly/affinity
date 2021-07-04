#if os(Linux)
import XCTest

XCTMain([
    testCase(TraversalTests.allTests),
    testCase(ShortestPathTests.allTests),
])
#endif