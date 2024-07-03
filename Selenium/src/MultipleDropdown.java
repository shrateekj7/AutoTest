import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown {
	
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://Selenium//Drivers//chromedriver_103.exe");

		driver=new ChromeDriver();
		driver.get("https://orangehrm.com/orangehrm-30-day-trial/");
		WebElement Noofemp=driver.findElement(By.name("NoOfEmployees"));
		selectOptionFromDropDown(Noofemp,"16-20");
		
		WebElement industry=driver.findElement(By.name("Industry"));
		selectOptionFromDropDown(industry,"Healtcare");
		
		WebElement country=driver.findElement(By.name("Country"));
		selectOptionFromDropDown(country,"Ghana");
		}
	
	public static void selectOptionFromDropDown(WebElement ele, String value) {
		
		Select drp=new Select(ele);
		List<WebElement>alloptions=drp.getOptions();
		for(WebElement option:alloptions) {
			if(option.getText().equals(value)) {
				option.click();
				break;
			}
		}
	}

}

