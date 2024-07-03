import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://Selenium//Drivers//chromedriver_103.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/sql/sql_select.asp");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,900)", "");
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@class='ws-table-all notranslate']//tbody//tr"));
		int totalrows=rows.size();
		System.out.println("totalrows are " + totalrows);
		
		List<WebElement>cols=driver.findElements(By.xpath("//table[@class='ws-table-all notranslate']//tbody//tr[2]//td"));
		int totalcols = cols.size();
		System.out.println("totalcols are "+ totalcols);
		
		for(int i=2;i<=totalrows;i++)
		{
			for(int j=1;j<=totalcols;j++) 
			{
WebElement coldata=driver.findElement(By.xpath("//table[@class='ws-table-all notranslate']//tbody//tr["+i+"]//td["+j+"]"));
			System.out.println(coldata.getText());;
			}
	}
	}
	}	