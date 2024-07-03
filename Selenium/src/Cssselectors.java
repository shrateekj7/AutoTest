import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselectors {

	public static void main(String[] args) {
	
			System.setProperty("webdriver.chrome.driver", "F://Selenium//Drivers//chromedriver_103.exe");

			WebDriver driver=new ChromeDriver();
			driver.get("https://www.gmail.com");
			
//class name - use to locate element based on class
//driver.findElement(By.cssSelector("input.whsOnd.zHQkBf")).sendKeys("locating by class css selector");
		
		//id 
//driver.findElement(By.cssSelector("input#identifierId")).sendKeys("locating with id css selector");
		
//driver.findElement(By.cssSelector("input[type = 'email']")).sendKeys("locating with attribute value");
		
//driver.findElement(By.cssSelector("input[type = 'email'][class ='whsOnd zHQkBf'] ")).sendKeys("locating with multiple attribute");
	
//driver.findElement(By.cssSelector("input[type ^= 'ema']")).sendKeys("locating with partial attribute starts with");		
			
//driver.findElement(By.cssSelector("input[type $= 'il']")).sendKeys("locating with partial attribute ends with");	
	
//driver.findElement(By.cssSelector("input[type *= 'mai']")).sendKeys("locating with pa containing middle part");	

}

}
