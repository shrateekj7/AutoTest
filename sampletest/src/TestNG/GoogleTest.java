package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	ChromeOptions option;
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Shrateek jaiswal\\eclipse\\chromedriver_win32\\chromedriver.exe");
	 option = new ChromeOptions();
     option.addArguments("--remote-allow-origins=*");
     driver = new ChromeDriver(option);
     driver.manage().window().maximize();
     driver.manage().deleteAllCookies();
     driver.get("https://www.google.com");
	}

	@Test(priority=1, groups="Title")
	public void googleTitleText() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	@Test(priority=2, groups="Logo")
	public void googleLogoText() {
		boolean a= driver.findElement(By.xpath("//img[@class=\"lnXdpd\"]")).isDisplayed();
		System.out.println(a);
	}
	@Test(priority=3, groups="Linked text")
	public void googleLinkedText() {
		boolean b= driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println(b);
	}
	@Test(priority=4, groups="Test")
	public void Test4() {
		System.out.println("Test 4 is passed");
	}
	@Test(priority=5, groups="Test")
	public void Test5() {
		System.out.println("Test 5 is passed");
	}
	@Test(priority=6, groups="Test")
	public void Test6() {
		System.out.println("Test 6 is passed");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
