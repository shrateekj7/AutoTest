import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettextVSattribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://Selenium//Drivers//chromedriver_103.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		
		driver.findElement(By.id("Email")).sendKeys("shrateek");
		//driver.findElement(By.id("Email")).clear();
		
		WebElement input=driver.findElement(By.id("Email"));
		//capturing text from an attribute in an html document
		System.out.println(input.getAttribute("value"));
		
		//capturing the text of an attribute
		System.out.println(input.getText());
		
	}

}

