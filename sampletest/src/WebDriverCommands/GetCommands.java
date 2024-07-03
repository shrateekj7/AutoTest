package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Shrateek jaiswal\\eclipse\\chromedriver_win32\\chromedriver.exe");
		  ChromeOptions option = new ChromeOptions();
          option.addArguments("--remote-allow-origins=*");
          WebDriver driver = new ChromeDriver(option);

	        driver.get("https://www.nopcommerce.com/en");
	        driver.manage().window().maximize();
	        System.out.println("current URL :" + driver.getCurrentUrl());
	        System.out.println("pagesource :" +  driver.getPageSource());
	        System.out.println("Title :" +  driver.getTitle());
	        String text= driver.findElement(By.xpath("//*[@id=\"en-page\"]/body/div[7]/section/div/div/div/div/div/div/div[1]/div/div[1]/div/a[1]")).getText();
	        System.out.println(text);
	        driver.close();
	
	}

}
