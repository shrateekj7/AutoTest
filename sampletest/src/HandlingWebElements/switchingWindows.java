package HandlingWebElements;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class switchingWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shrateek jaiswal\\eclipse\\chromedriver_win32\\chromedriver.exe") ;
	    ChromeOptions option = new ChromeOptions();
	    option.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver(option);
        driver.get("https://demo.automationtesting.in/Windows.html");
        driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
        //System.out.println(driver.getTitle());
        Set <String > s= driver.getWindowHandles(); // return id/key value of a browser/ window
        for (String i: s) {
        	String t=driver.switchTo().window(i).getTitle();
        	System.out.println(t);
        	if (t.contains("Selenium")) {
        		driver.close();
        }
	}
	}}
