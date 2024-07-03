package TestNG;

import org.testng.annotations.Test;

public class TestngFeatures {

	@Test
	public void Test1() {
		System.out.println("Test 1 is passed");
	}
	
	@Test(dependsOnMethods="Test1" )
	public void Test2() {
		System.out.println("Test 2 is passed");
	}
}
