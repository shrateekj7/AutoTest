import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F://Selenium//Drivers//chromedriver_103.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.gmail.com");
	
	//use to locate element with id attribute
	//driver.findElement(By.id("identifierId")).sendKeys("locating with id");
			
	//use to locate element with name attribute
	//driver.findElement(By.name("identifier")).sendKeys("locating with name");
	
	//use to locate element with classname
	//driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("locating with classname");
	
	// linktext
	//driver.findElement(By.linkText("Learn more")).click();
	
	//partial linktext (partial words are picked up,maybe first maybe last but case should match)
	//driver.findElement(By.partialLinkText("Learn")).click();
	
	//use to locate element by tag name
	//driver.findElement(By.tagName("a")).click();	
	
		}
	
	}

