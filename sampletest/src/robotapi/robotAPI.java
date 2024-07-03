package robotapi;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class robotAPI {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shrateek jaiswal\\eclipse\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("");
		driver.findElement(By.xpath(""));
		 Robot robot= new Robot();
		 robot.keyPress(KeyEvent.VK_DOWN); //press down in keyboard
		 robot.keyPress(KeyEvent.VK_TAB);
		 robot.keyPress(KeyEvent.VK_ENTER); //enter key
		 
	}

}
