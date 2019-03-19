package houseConstructionCost;

/**
 * This class provides method to calculate house cost based on various material quality
 * and facility 
 * @author Nikhil Attar
 *
 */

public class HouseConstructionCost {

	/**
	 * This method calculates the house cost based on various material quality
	 * @param materialQuality, represents quality of material
	 * @param area, represents area in square feet
	 * @param fullyAutomated, represents home should be fully automated or not
	 * @return cost of construction in INR
	 */
	public double ConstructionCost(String materialQuality, double area, String fullyAutomated) {
		
		/**
		 * checks if materialQuality is standard
		 */
		if(materialQuality.equals("standard")) {
			return 1200*area;
		}
		
		/**
		 * checks if materialQuality is above_standard 
		 */
		else if( materialQuality.equals("above_standard")) {
			return 1500*area;
		}
		
		/**
		 * checks if materialQuality is high_standard and customer wants fully automated home
		 */
		else if(materialQuality.equals("high_standard") && fullyAutomated.equals("yes")){
			return 2500*area;
		}
		
		/**
		 * In this case user only want high_standard materialQuality
		 */
		else {
			return 1800*area;
		}
	}
	
}
