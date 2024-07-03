package WebDriverCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NavigationCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Shrateek jaiswal\\eclipse\\chromedriver_win32\\chromedriver.exe");
		  ChromeOptions option = new ChromeOptions();
         option.addArguments("--remote-allow-origins=*");
         WebDriver driver = new ChromeDriver(option);
	     driver.get("https://www.nopcommerce.com/en");
	     driver.navigate().to("https://www.facebook.com/");
	     driver.navigate().back();
	     driver.navigate().refresh();
	     driver.navigate().forward();
	     driver.quit();

	}

}
