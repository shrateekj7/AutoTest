package ParallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ParallelTest {
	
	@Test
	public void OpenGoogle() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shrateek jaiswal\\eclipse\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
	    option.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver(option);
	    driver.get("https://www.google.com");
		System.out.println("Google is opened");
	}
	@Test
	public void OpenFB() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shrateek jaiswal\\eclipse\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
	    option.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver(option);
	    driver.get("https://www.facebook.com");
		System.out.println("FB is opened");
	}
	
}
