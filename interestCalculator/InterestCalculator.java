package interestCalculator;

/**
 * This class provides methods to calculate simple interest and compound interest
 * @author Nikhil Attar
 *
 */

public class InterestCalculator {

	/**
	 * This method calculates simple interest 
	 * @param principle
	 * @param rate
	 * @param time
	 * @return (principle*rate*time)/100.0
	 * @throws Exception, when any of parameter is negative 
	 */
	public double simpleInterest(double principle, double rate, double time) throws Exception {
		
		if(principle < 0 || rate < 0 || time < 0)
		{
			throw new Exception("Invalid parameters");
		}
		
		return ((principle*rate*time)/100.0);
	}
	
	/**
	 * This method calculates compound interest
	 * @param principle
	 * @param rate
	 * @param time
	 * @return principle*(Math.pow(1+(rate/100), time))
	 * @throws Exception, when any of parameter is negative 
	 */
	public double compoundInterest(double principle, double rate, double time) throws Exception {
		
		if(principle < 0 || rate < 0 || time < 0)
		{
			throw new Exception("Invalid parameters");
		}
		
		return (principle*(Math.pow(1+(rate/100), time)));
	}
	
}
