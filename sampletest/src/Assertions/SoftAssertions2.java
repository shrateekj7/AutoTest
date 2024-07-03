package Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions2 {
	SoftAssert softassert = new SoftAssert();
	@Test
	void demo1() {
		softassert.assertEquals("welcome","wel"); //fail
		softassert.assertAll(); 
	}
	@Test
	void demo2() {
		softassert.assertEquals("welcome","welcome"); 
		softassert.assertAll(); 
	}
}
//if the first test fails then even if the second test is pass, then also second will fail. In order to overcome this issue we need to create two different objects