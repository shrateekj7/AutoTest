package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;


public class RetryAnalyserUseClass {
	
	@Test (retryAnalyzer = RetryAnalyserDemo.class)
	public void test ()
	{
		Assert.assertEquals(true, false);
	}
}