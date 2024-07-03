package headlessbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headlesschrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Shrateek jaiswal\\eclipse\\chromedriver_win32\\chromedriver.exe");

        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        option.setHeadless(true);

        WebDriver driver = new ChromeDriver(option);
       
        driver.get("https://www.nopcommerce.com/en");
        System.out.println("the title of the page: "+ driver.getTitle());
        System.out.println("the URL of the page: "+ driver.getCurrentUrl());
	}

}
