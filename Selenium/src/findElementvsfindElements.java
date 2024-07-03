import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementvsfindElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://Selenium//Drivers//chromedriver_103.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
	
		//find element -- returns single webelement
		//scenario 1 send xyz in searchbox
		/*WebElement searchbox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		searchbox.sendKeys("xyz");*/
		
		//scenario 2 returns first element
		/*WebElement element=driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println(element.getText());*/
		
		//scenario 3 returns nosuchexception
		
		//WebElement searchbutton=driver.findElement(By.xpath("//button[normalize-space()='login']"));

		//find elements -- returns multiple webelement
		//scenario 1
		/*List<WebElement> links=driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println("no. of elements captured :"+links.size());*/
		
		//scenario 2 
		/*List<WebElement> logo=driver.findElements(By.xpath("//img[@alt='nopCommerce demo atore']"));
		System.out.println(logo.size());*/

		//scenario 3 --  to show all elements of list
		List<WebElement> links=driver.findElements(By.xpath("//div[@class='footer-upper']//a"));

		for(WebElement ele:links)
		{
			System.out.println(ele.getText());
		}
	}
}
