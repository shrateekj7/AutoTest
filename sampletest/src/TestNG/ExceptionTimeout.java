package TestNG;

import org.testng.annotations.Test;

public class ExceptionTimeout {

	@Test(expectedExceptions=NumberFormatException.class)
	public void Test1() {
		String x= "100A";
		Integer.parseInt(x);
	}
}
