package houseConstructionCost;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HouseConstructionCostTest {

	HouseConstructionCost hcc = new HouseConstructionCost();
	
	@Test
	void test() {
		assertEquals(264000.0, hcc.ConstructionCost("standard", 220.0, "no"));
		assertEquals(3277500.0, hcc.ConstructionCost("above_standard", 2185.0, "no"));
		assertEquals(630000.0, hcc.ConstructionCost("high_standard", 350.0, "no"));
		assertEquals(875000.0, hcc.ConstructionCost("high_standard", 350.0, "yes"));
	}

}
