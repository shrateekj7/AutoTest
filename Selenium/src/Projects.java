import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Projects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F://Selenium//Drivers//chromedriver_103.exe");
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.get("https://www.flipkart.com");
		System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
		System.out.println("current url is "+driver.getCurrentUrl());
		driver.manage().window().maximize();
		System.out.println(driver.manage().window().getSize());
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
	}

}
