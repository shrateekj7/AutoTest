package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions1 {
	@Test
	void demotest() {
	Assert.assertTrue(true); //passed
	Assert.assertEquals("welcome","welcome");
	System.out.println("Test is successfully passed!");
	
	}     
}
