import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchingwindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://Selenium//Drivers//chromedriver_103.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		WebElement textBoxinPW=driver.findElement(By.id("name"));
		
		WebElement newWindowbtn=driver.findElement(By.id("newWindowBtn"));
		newWindowbtn.click();
		
		String parentWindow=driver.getWindowHandle();
		System.out.println("this is parent window handle: "+parentWindow);
		Set<String> getWindows=driver.getWindowHandles();
		for (String handle : getWindows) {
			System.out.println(handle);
			if(handle.equals(parentWindow)) {
				driver.switchTo().window(handle);
				driver.manage().window().maximize();
				driver.findElement(By.id("firstName")).sendKeys("this is child window");
			}
		}
		driver.switchTo().window(parentWindow);
		textBoxinPW.sendKeys("this is parent window");
		
	}

}
