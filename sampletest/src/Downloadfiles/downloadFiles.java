package Downloadfiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class downloadFiles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shrateek jaiswal\\eclipse\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
			       	
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"textbox\"]")).sendKeys("xyz");
		driver.findElement(By.xpath("//*[@id=\"createTxt\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"link-to-download\"]")).click();
		
		/*FirefoxProfile profile = new FirefoxProfile(); //create firefox profile object 
		
		//set preference to not show download confirming dialogue using 
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/plain"); //set mime types
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		
		FirefoxOptions options= new FirefoxOptions();
		options.setProfile(profile);
		
		//initialize firefox driver */
	
		}

}
