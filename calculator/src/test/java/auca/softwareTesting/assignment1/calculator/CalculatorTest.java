package auca.softwareTesting.assignment1.calculator;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	private Calculator calculator;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAdd() {
		calculator = new Calculator();
		double a = 1;
		double b = 1;
		double result = calculator.add(a, b);

		assertEquals(2, result, "should add up to 2");
	}

	@Test
	void testSubtract() {
		calculator = new Calculator();
		double a = 2;
		double b = 1;
		double result = calculator.subtract(a, b);

		assertEquals(1, result, "difference should be 1");
	}

//	@Test
//	void testMultiply() {
//		calculator = new Calculator();
//		double a = 2;
//		double b = 3;
//		double result = calculator.multiply(a, b);
//
//		assertEquals(6, result, "should be equal to 6");
//	}
//
//	@Test
//	void testDivide() {
//		calculator = new Calculator();
//		double a = 15;
//		double b = 3;
//		double result = calculator.divide(a, b);
//
//		assertEquals(5, result, "should be equal to 5");
//	}
//
//	@Test
//	void testSquare() {
//		calculator = new Calculator();
//		double a = 16;
//		double result = calculator.square(a);
//
//		assertEquals(4, result, "should be equal to 4");
//	}
//
//	@Test
//	void testPower() {
//		calculator = new Calculator();
//		double a = 2;
//		double b = 3;
//		double result = calculator.power(a, b);
//
//		assertEquals(8, result, "should be equal to 8");
//	}

}