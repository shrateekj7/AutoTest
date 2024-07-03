import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://Selenium//Drivers//chromedriver_103.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		WebElement Timeralertbutton=driver.findElement(By.id("timerAlertButton"));
		Timeralertbutton.click();
		WebDriverWait wait= new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.alertIsPresent());
		System.out.println("found alert");		
	}

}
