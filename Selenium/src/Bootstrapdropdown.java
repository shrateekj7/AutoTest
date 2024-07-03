import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrapdropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F://Selenium//Drivers//chromedriver_103.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.findElement(By.xpath("//div[@class='drp1']//div[@class = 'dropdown']")).click();
		
		//product type
		List<WebElement> productTypes=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		System.out.println(productTypes.size());
		for(WebElement ptype:productTypes) {
			if(ptype.getText().equals("Accounts")) {
				ptype.click();
				break;
			}
		//product 
			driver.findElement(By.xpath("//div[@class='drp2']//div[@class = 'dropdown']")).click();

			List<WebElement> products=driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
			System.out.println(products.size());
			for(WebElement Product:products) {
				if(Product.getText().equals("Salary Accounts"))
				{
					Product.click();
					break;
				}
			}
		}
	}
}
		
		


