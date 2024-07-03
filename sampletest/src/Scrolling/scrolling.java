package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class scrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shrateek jaiswal\\eclipse\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.worldometers.info/geography/how-many-countries-are-there-in-the-world/");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		//scrolling by using pixel
		//js.executeScript("window.scrollBy(0, 1000)","");
		
		//scrolling till we find the element
		//WebElement flag= driver.findElement(By.xpath("//*[@id=\"example2\"]/tbody/tr[19]/td[2]/a"));
		//js.executeScript("arguments[0].scrollIntoView(true);",flag);
		
		//scrolling till bottom of the page
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}

}
