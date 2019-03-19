package interestCalculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InterestCalculatorTest {

	InterestCalculator ic = new InterestCalculator();
	
	@Test
	void simpleInterestTest() throws Exception {
		assertEquals(50.4, ic.simpleInterest(42.0, 15.0, 8.0));
		assertEquals(4016.25, ic.simpleInterest(8925.0, 9.0, 5.0));
		assertEquals(81.0, ic.simpleInterest(450.0, 4.5, 4.0));
		Assertions.assertThrows(Exception.class,()->ic.simpleInterest(-42.0, 15.0, 8.0));
		Assertions.assertThrows(Exception.class,()->ic.simpleInterest(42.0, -15.0, 8.0));
		Assertions.assertThrows(Exception.class,()->ic.simpleInterest(42.0, 15.0, -8.0));
		Assertions.assertThrows(Exception.class,()->ic.simpleInterest(-42.0, -15.0, -8.0));
	}
	
	@Test
	void compoundInterestTest() throws Exception {
		assertEquals(26620.000000000007, ic.compoundInterest(20000.0, 10.0, 3.0));
		assertEquals(23010.295503339617, ic.compoundInterest(18256.0, 9.7, 2.5));
		assertEquals(1215.5062500000001, ic.compoundInterest(1000.0, 5.0, 4.0));
		Assertions.assertThrows(Exception.class,()->ic.simpleInterest(-1000.0, 5.0, 8.0));
		Assertions.assertThrows(Exception.class,()->ic.simpleInterest(1000.0, -5.0, 8.0));
		Assertions.assertThrows(Exception.class,()->ic.simpleInterest(1000.0, 5.0, -8.0));
		Assertions.assertThrows(Exception.class,()->ic.simpleInterest(-1000.0, -5.0, -8.0));
	}

}
