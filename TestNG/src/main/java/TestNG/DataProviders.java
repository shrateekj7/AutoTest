package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

	@DataProvider (name="getValue")
	public Object[][] DataProviderMethod()
	{
		return new Object[][] {{"shrateek"},{"jaiswal"}};
	}

	@Test (dataProvider="getValue")
	public void myTest(String value) {
		System.out.println("Passed parameter is "+value);
	}
}
