package jUnitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddNumber {

	@Test
	void test() {
		
		jUnitFunctions junit = new jUnitFunctions();
		int result = junit.addNumbers(52, 38);
		assertEquals(90, result);
	}

}
