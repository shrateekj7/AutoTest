package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions2 {
	@Test
	void demotest() {
	Assert.assertTrue(true); //passed
	Assert.assertEquals("welcome","Welcome"); //failed
	System.out.println("Test is successfully passed!");
	
	}
}
