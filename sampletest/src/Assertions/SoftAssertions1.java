package Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions1 {

	SoftAssert softassert = new SoftAssert();
	@Test
	void demotest() {
		softassert.assertTrue(true); //pass
		softassert.assertEquals("welcome","welcomE"); //fail
		softassert.assertEquals("welcome","welcome"); //pass
		System.out.println("Test is successfully passed!");
		softassert.assertAll(); //always include at the end 
	}
}
