package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ConditionalCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shrateek jaiswal\\eclipse\\chromedriver_win32\\chromedriver.exe");
		  ChromeOptions option = new ChromeOptions();
       option.addArguments("--remote-allow-origins=*");
       WebDriver driver = new ChromeDriver(option);
	     driver.get("https://demoqa.com/text-box");
	    WebElement name  =  driver.findElement(By.xpath("//*[@id=\"userName\"]"));
	    WebElement email =  driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));

	    if (name.isDisplayed()&& name.isEnabled()) {
	    	name.sendKeys("shreza parker");
	    }
	    
	    if (email.isDisplayed() && email.isEnabled()){
	    email.sendKeys("shreza@yopmail.com");
	    }
	    
	    driver.navigate().to("https://demoqa.com/radio-button");
	    System.out.println(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label")).isSelected());
	    
	    System.out.println(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/label")).isSelected());

	    if (driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label")).isSelected()== false) {
	    	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label")).click();
	    }
	   
	}

}
