package jUnitTestPackage;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ testAddNumber.class, testAddStrings.class })
public class AllTests {

}
