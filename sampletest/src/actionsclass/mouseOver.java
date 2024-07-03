package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class mouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shrateek jaiswal\\eclipse\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
			       
		driver.get("https://demo.automationtesting.in/Alerts.html");
		WebElement switchto = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a"));
		WebElement windows = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[2]/a"));
		Actions act = new Actions(driver);
	  /*act.moveToElement(switchto).build().perform(); //hover cursor to dropdown
		act.moveToElement(windows).click().build().perform();*/
		
		act.moveToElement(switchto).moveToElement(windows).click().build().perform();
		
	//right click
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rightclick= driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div/p/span"));
		act.contextClick(rightclick).build().perform();
		driver.findElement(By.xpath("/html/body/ul/li[1]")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	}

	
}
