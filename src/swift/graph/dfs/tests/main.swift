#if os(Linux)
import XCTest

XCTMain([
    testCase(RecursiveTraversalTests.allTests),
    testCase(IterativeTraversalTests.allTests),
])
#endif