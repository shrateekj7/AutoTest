import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F://Selenium//Drivers//chromedriver_103.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://eportal.incometax.gov.in/iec/foservices/#/login");

		// This will be used when user wants code to wait without any condition. Code will compulsory will wait for specified time duration
		Thread.sleep(1000);
		// implicit wait -- this will wait for all elements until driver instance get closed.
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		WebElement panAdhaarUserId=driver.findElement(By.id("panAdhaarUserId"));
		panAdhaarUserId.sendKeys("11223344");
	
	}

}
