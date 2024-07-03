package exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoFramepresentex {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://Selenium//Drivers//chromedriver_103.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/");
		
		//this no frame present exception will be thrown if specified frame is not available
		driver.switchTo().frame("test");
		
		//this will be thrown if syntax of locator is wrong
		driver.findElement(By.cssSelector("@frmTextBox"));
		
		
	}

}
