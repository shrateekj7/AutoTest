package Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions3 {
	SoftAssert softassert1 = new SoftAssert();
	SoftAssert softassert2 = new SoftAssert();
	@Test
	void demo1() {
		softassert1.assertEquals("welcome","wel"); //fail
		softassert1.assertAll(); 
	}
	@Test
	void demo2() {
		softassert2.assertEquals("welcome","welcome"); 
		softassert2.assertAll(); 
	}
}
