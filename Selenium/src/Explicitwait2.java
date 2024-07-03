import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait2 {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F://Selenium//Drivers//chromedriver_103.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1300)", "");
		
		WebElement deletesuccess=driver.findElement(By.id("deletesuccess"));
		
		WebDriverWait wait= new WebDriverWait(driver,30);
		
		WebElement alert2=driver.findElement(By.id("alert2"));
		
		wait.until(ExpectedConditions.invisibilityOf(deletesuccess));
		alert2.click();
		
		
	}

}
