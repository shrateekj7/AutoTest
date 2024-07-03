package TestNG;

import org.testng.annotations.Test;

public class TestMethodforDP {
	
	@Test (dataProvider="getValue", dataProviderClass= DataProviders.class)
	public void myTest(String value) {
		System.out.println("This is getting printed from testmethodforDP class  ");
		System.out.println("Passed parameter is "+value);
	}
}
