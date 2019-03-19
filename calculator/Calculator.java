package calculator;


/**
 * This class contains methods for basic arithmetic operations in calculator
 * @author Nikhil Attar
 */

public class Calculator {

/**
 * This method will return sum of two integer numbers
 * @param operand1, represents first operand
 * @param operand2, represents second operand
 * @return operand1+operand2
 */

public int sum(int operand1, int operand2)
{
	return (operand1+operand2);
}

/**
 * This method will return product of two integer numbers
 * @param operand1, represents first operand
 * @param operand2, represents second operand
 * @return operand1*operand2
 */

public int product(int operand1, int operand2)
{
	return (operand1*operand2);
}

/**
 * This method will return division of two integer numbers
 * @param operand1, represents first operand
 * @param operand2, represents second operand
 * @return operand1/operand2
 * @throws ArithmeticException, when operand2 is zero
 */

public int division(int operand1, int operand2) throws Exception
{	
	if(operand2 == 0)
	{
		throw new ArithmeticException("Divide by zero");
	}
	
	return operand1/operand2;
}

}

