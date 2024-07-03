package exceptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nosuchwindowex {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://Selenium//Drivers//chromedriver_103.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		//this no such window exception will be thrown if specified window is not available
		driver.switchTo().window("test");
		
	}

}
