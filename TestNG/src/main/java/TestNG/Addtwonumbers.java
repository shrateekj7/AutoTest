package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Addtwonumbers {
	
	@Test
	@Parameters ("Value1, Value2")
public void sum(int v1, int v2) {
	int finalSum = v1+v2;
	System.out.println("final sum of given values : "+finalSum);
}
}
