package com.redhat.shipping;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShippingCalculatorTest {

    // @todo: add tests
    @Test
    public void canCalculateTheCostForARegion() {
	     ShippingCalculator calculator = new ShippingCalculator();
	      assertEquals(0, calculator.costForRegion("A Region"));
    }

    @Test
    public void onNARegionTheCostIs100() {
	     assertEquals(100, (new ShippingCalculator()).costForRegion("NA"));
    }

    @Test
    public void onLATAMRegionTheCostIs200() {
	     // Given a shipping calculator
	       ShippingCalculator calculator = new ShippingCalculator();
	     // When LATAM is the country region
	       int calculatedCost = calculator.costForRegion("LATAM");
	     // Then the shipping cost is 200
	       assertEquals(200, calculatedCost);
    }

    @Test
    public void onEMEARegionTheCostIs300() {

	     ShippingCalculator calculator = new ShippingCalculator();
	     int calculatedCost = calculator.costForRegion("EMEA");
	     assertEquals(300, calculatedCost);
    }

    @Test
    public void onAPACRegionTheCostIs400() {

	     ShippingCalculator calculator = new ShippingCalculator();
	     int calculatedCost = calculator.costForRegion("APAC");
	     assertEquals(400, calculatedCost);
    }

    @Test
    public void onNonSupportedRegionARegionNotFoundExceptionIsRaised() {
	     ShippingCalculator calculator = new ShippingCalculator();
	      
	     assertThrows(  
		RegionNotFoundException.class,
	        () -> calculator.costForRegion("Unknown Region")
          );
    }

}
