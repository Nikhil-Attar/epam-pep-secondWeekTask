package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator c = new Calculator();
	
	@Test
	void sumUnitTest() {
		assertEquals(12, c.sum(3, 9));
		assertEquals(6, c.sum(-3, 9));
		assertEquals(-6, c.sum(3, -9));
		assertEquals(-12, c.sum(-3, -9));
	}
	
	@Test
	void productUnitTest()
	{
		assertEquals(20, c.product(4, 5));
		assertEquals(-20, c.product(-4, 5));
		assertEquals(-20, c.product(4, -5));
		assertEquals(20, c.product(-4, -5));
		assertEquals(0, c.product(4, 0));
	}
	
	@Test
	void divisionUnitTest() throws Exception
	{
		assertEquals(3, c.division(7,2));
		assertEquals(2, c.division(4,2));
		assertEquals(-5, c.division(-25,5));
		assertEquals(-5, c.division(25,-5));
		assertEquals(3, c.division(-9,-3));
		Assertions.assertThrows(ArithmeticException.class,()->c.division(25, 0));
	}

}
