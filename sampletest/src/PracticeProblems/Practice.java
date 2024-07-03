package PracticeProblems;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shrateek jaiswal\\eclipse\\chromedriver_win32\\chromedriver.exe") ;
	    ChromeOptions option = new ChromeOptions();
	    option.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver(option);
        driver.get("https://ww.google.com");
	}

}
