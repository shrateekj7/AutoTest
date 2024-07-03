package TestNG;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNG.Listeners.class)
public class TestClassUseListener {

	//test to pass as to verify pass method of listener
	@Test
	public void printHelloworld() {
		System.out.println("this is printing hello world");
	}
	
	//test to pass as to verify fail method of listener
	@Test
	public void testTofail() {
		System.out.println("this is method to test fail");
		Assert.assertTrue(false);
	}
	
}
