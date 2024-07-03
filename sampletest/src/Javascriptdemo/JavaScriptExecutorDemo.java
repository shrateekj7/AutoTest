package Javascriptdemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shrateek jaiswal\\eclipse\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
	    option.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver(option);
        driver.get("https://twoplugs.com/");
        //Flash
       WebElement joinfree = driver.findElement(By.xpath("/html/body/div[1]/header/div/ul/li[2]/a/span"));
       //javascriptUtil.flash(joinfree, driver);  
        
        //Draw border and screenshot
     /* WebElement joinfree = driver.findElement(By.xpath("/html/body/div[1]/header/div/ul/li[2]/a/span"));
      javascriptUtil.drawBorder(joinfree, driver);
      
      File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile( src , new File("C://screenshot/twoplugs.png"));*/

      //title of page
      //String title = javascriptUtil.getTitleByJS(driver);
      //System.out.println(title);
       
       //click element by JS
      //WebElement loginBTN=driver.findElement(By.xpath("/html/body/div[1]/header/div/ul/li[1]/a/span"));
      //javascriptUtil.clickElementByJS(loginBTN, driver);
       
       //generate alert info
      //javascriptUtil.generateAlert(driver,"you clicked on message button");
       
       //refresh the page
       //driver.navigate().refresh();
       //javascriptUtil.refreshBrowserByJS(driver);
       
       //scroll the page till we found an element
       //WebElement image=driver.findElement(By.xpath("//*[@id=\"rslides3_s0\"]/div[1]/img"));
       //javascriptUtil.scrollIntoView(image, driver);
       
       //scroll till end of page
       javascriptUtil.scrollPageDown(driver);
	}

}
