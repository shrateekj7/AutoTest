import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F://Selenium//Drivers//chromedriver_103.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		WebElement dropdown=driver.findElement(By.id("course"));
		dropdown.click();  //to click on dropdown menu

		Select dropdownValue=new Select(dropdown);
		dropdownValue.selectByValue("net");
		
		dropdownValue.deselectByValue("net");
		
		//dropdownValue.selectByVisibleText("Javascript");
		
		//dropdownValue.selectByIndex(3);
		
		//dropdown without using select methods
		/*List<WebElement> alloptions=new dropdownValue.getOptions();
		for(WebElement option:alloptions ) {
			if(option.getText().equals("Javascript")) {
				option.click();
				break;*/
		
		//this will tell if dropdown is multiple or single
		//System.out.println(dropdownValue.isMultiple());
		
		//System.out.println(dropdownValue.getFirstSelectedOption().getText());
		
		//driver.close();
			}		
	}

