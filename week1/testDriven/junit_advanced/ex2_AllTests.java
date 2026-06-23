package testDriven.junit_advanced;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({EvenCheckerTest.class, ex3_OrderedTests.class})
public class ex2_AllTests {
}