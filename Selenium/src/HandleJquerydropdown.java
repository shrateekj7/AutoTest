import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleJquerydropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F://Selenium//Drivers//chromedriver_103.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		driver.findElement(By.id("justAnInputBox")).click();
		//selectChoice(driver, "choice 1");
		//selectChoice(driver, "choice 1","choice 2 3","choice 6 3");
		selectChoice(driver, "all");
	
	}
public static void selectChoice(WebDriver driver,String...value ) {
	List<WebElement> choiceList=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
	if(!value[0].equalsIgnoreCase("all")) 
	{
		for(WebElement item:choiceList)
		{
			String text=item.getText();
			for(String val:value)
			{
				if(text.equals(val)) {
					item.click();
					break;
				}
			}
		}
	}
		
	else {
		try {for(WebElement item:choiceList) 
		{
			item.click();
		}
		}
		catch(Exception e) {
	}
}
}
}
