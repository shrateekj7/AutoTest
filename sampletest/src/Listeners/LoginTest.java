package Listeners;

import org.junit.Assert;
import org.testng.annotations.Test;


public class LoginTest {
	@Test//(enabled=false)----to exclude any test case
	public void LoginByEmail() {
		System.out.println("this is login by email");
		Assert.assertEquals("shrateek","shrateek");//true
	}
	@Test
	public void LoginByFB() {
		System.out.println("this is login by FB");
		Assert.assertEquals("shrateek","jaiswal");//false
	}
	
}
