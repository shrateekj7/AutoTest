package Assertions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestCase1 {

	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shrateek jaiswal\\eclipse\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
	    option.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver(option);
	    driver.get("https://demo.guru99.com/test/newtours/");
        
	    WebElement usertext=driver.findElement(By.name("userName"));
	    WebElement pswrdtext=driver.findElement(By.name("password"));
	    
	    Assert.assertTrue(usertext.isDisplayed());
	    usertext.sendKeys("mercury");// test will only continue if the above statement is true
	    
	    Assert.assertTrue(pswrdtext.isDisplayed());
	    usertext.sendKeys("mercury");
	    
	  /*  Assert.assertFalse(usertext.isDisplayed()); //this is a negative condition. Condition should return false.
	    usertext.sendKeys("mercury");
	    
	    Assert.assertFalse(pswrdtext.isDisplayed());
	    usertext.sendKeys("mercury");*/ 
	    
	    driver.findElement(By.name("submit")).click();
	    
	    String Exptitle = "Welcome: Mercury Tours";
	    Assert.assertEquals(Exptitle, driver.getTitle());  
	    driver.close();
	   
	}
}
