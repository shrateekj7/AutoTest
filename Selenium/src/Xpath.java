import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F://Selenium//Drivers//chromedriver_103.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		
	//driver.findElement(By.xpath("//input[@type = 'email']")).sendKeys("locating with xpath");
	//driver.findElement(By.xpath("//input[@name = 'identifier']")).sendKeys("locating with xpath");
	
	//contains	
	//driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();	
	
	//starts with
	//driver.findElement(By.xpath("//input[starts-with(@id, 'ident')]")).sendKeys("trying to locate with starts with");	

	//ends with (error)
	driver.findElement(By.xpath("//input[ends-with(@id, 'userName')]")).sendKeys("trying to locate with ends with");	
	
	}

}
