package exceptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoAlertpresentex {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://Selenium//Drivers//chromedriver_103.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/");
		
		//this no alert exception will be thrown if specified alert is not available
		driver.switchTo().alert();
		
	}

}
