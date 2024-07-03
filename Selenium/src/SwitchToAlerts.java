import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchToAlerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F://Selenium//Drivers//chromedriver_103.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		//this will wait until page gets loaded completely
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,30);
		
		WebElement alertBox=driver.findElement(By.id("alertBox"));
		alertBox.click();
		
		//this will wait if alert takes time to get displayed
		wait.until(ExpectedConditions.alertIsPresent());
		
		//this command will be used to switch to alert
		Alert firstAlert=driver.switchTo().alert();
		//this command will be used to accept the alert
		firstAlert.accept();
		
		WebElement confirmBox = driver.findElement(By.id("confirmBox"));

		confirmBox.click();

		Alert confirmBoxAlert = driver.switchTo().alert();

		Thread.sleep(2000);

		// this command will be used to get text of alert

		System.out.println(confirmBoxAlert.getText());

		// this command will be used to dismiss alert.

		confirmBoxAlert.dismiss();

		// this method will be used to get text

		//System.out.println(output.getText());

		// this method will be used to switch back to detault content

		driver.switchTo().defaultContent();

		// alertBox.click();
		
	}

}
