package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class switchBetweenAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shrateek jaiswal\\eclipse\\chromedriver_win32\\chromedriver.exe") ;
	    ChromeOptions option = new ChromeOptions();
	    option.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver(option);
	    driver.get("https://demo.automationtesting.in/Alerts.html");
	    //alert with ok
	   driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
	    System.out.println(driver.switchTo().alert().getText());
	    driver.switchTo().alert().accept();
	    
	    //alert with cancel
	   driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
	    System.out.println(driver.switchTo().alert().getText());
	    driver.switchTo().alert().dismiss();
	    
	    //alert with comparison
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
	    System.out.println(driver.switchTo().alert().getText());

	    String ExpTextOk = ("You pressed Ok");
	    driver.switchTo().alert().accept();
	    String ActText = driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();

	    if(ExpTextOk.equals(ActText)== true) {
	    	System.out.println("test is passed");
	    }
	  
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
	    String ExpTextCancel = ("You pressed Cancel");

	    driver.switchTo().alert().dismiss();
	   
	    if(ExpTextCancel.equals(ActText)== true) {
	    	System.out.println("test is passed");
	    }
	    
	    
	    //alert with sendkeys
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
	    driver.switchTo().alert().sendKeys("shrateek");
	    driver.switchTo().alert().accept();
	    String Exp = "Hello Automation Testing user How are you today";
	    WebElement Act = driver.findElement(By.xpath("//*[@id=\"demo1\"]"));
	   if(Exp.equals(Act)== true){
		   System.out.println("test is passed");	   
	  }
     }	  
	}
