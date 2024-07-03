
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Genericmethod {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F://Selenium//Drivers//chromedriver_103.exe");

		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/sql/sql_select.asp");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,900)", "");
		
		WebElement tablelocator = driver.findElement(By.xpath("//table[@class='ws-table-all notranslate']"));
		int noofrows = Genericmethod.getRowcount (tablelocator);
		System.out.println("No of rows are "+noofrows);
		
		}
	
	public static int getRowcount(WebElement tablelocator) {
		By rowlocator=By.tagName("tr");
		List<WebElement> rows=tablelocator.findElements(rowlocator);
		int rowcount=rows.size();
	return rowcount;	
	}

}
