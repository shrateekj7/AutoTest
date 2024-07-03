package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNGBasics {

	@BeforeSuite //1
	public void setUp() {
		System.out.println("@BeforeSuite - setup system property");
	}
	@BeforeTest //2
	public void launchBrowser() {
		System.out.println("@BeforeTest - launch chrome browser");
	}
	@BeforeClass //3
	public void enterURL() {
		System.out.println("@BeforeClass  - enter URL");
	}
	@BeforeMethod //4
	public void login() {
		System.out.println("@BeforeMethod - login to app");
	}
	
	@Test 
	public void searchText() {
		System.out.println("@Test - get search text");
	}
	@Test 
	public void googleLogoText() {
		System.out.println("@Test - get google logo text");
	}
	@AfterMethod 
	public void logOut() {
		System.out.println("@AfterMethod - logout from app");
	}
	@AfterClass 
	public void closeBrowser() {
		System.out.println("@AfterClass  - close the browser");
	}
	@AfterTest 
	public void deleteCookies() {
		System.out.println("@AfterTest - delete all cookies");
	}
	@AfterSuite 
	public void generateTR() {
		System.out.println("@AfterSuite - generate test report");
	}
	/*if two test case are there then it'll execute as:
	*@BeforeMethod
	*@Test1
	*@AfterMethod
	*@BeforeMethod
	*@Test2
	*@AfterMethod
	*/
}
