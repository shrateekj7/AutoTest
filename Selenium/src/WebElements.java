import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "F://Selenium//Drivers//chromedriver_103.exe");

		 driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,650)", ""); //to scroll more, change the co-ordinates
		
		
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Shrateek");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Jaiswal");	
		
		driver.findElement(By.xpath("//*[@id=\"malerb\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"englishchbx\"]")).click();
		// to select multiple checkboxes you have to write xpath of each checkbox
		
		driver.findElement(By.xpath("//*[@id=\"registerbtn\"]")).click(); 
		
		//will check if checkbox is displayed
		WebElement checkbox=driver.findElement(By.xpath("//*[@id=\"englishchbx\"]"));
		System.out.println("Is checkboc getting displayed="+checkbox.isDisplayed());

		//will check if checkbox is enabled to  click or not
		System.out.println("Is checkbox is enabled="+checkbox.isEnabled());

		//to calculate size of all elements
		List<WebElement> button=driver.findElements(By.xpath("//input[@class='bcCheckBox']"));
		System.out.println("size is "+button.size());
		


	}

}
