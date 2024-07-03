package Brokenlinks;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class brokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shrateek jaiswal\\eclipse\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
			       	
		
		driver.manage().window().maximize();
		 
		 driver.get("https://newtours.demoaut.com/");
		 Thread.sleep(5000);
		 
		 //capture link from the webpage
		 List<WebElement> links =driver.findElements(By.tagName("a"));
		 
		 //number of links
		 System.out.println(links.size());
		  
		 for (int i=0; i<links.size();i++) {
		 //by using href property we can get URL of required link
		 WebElement element = links.get(i);
		 String url =element.getAttribute("href");
		 
		 URL link = new URL (url);
		 
		 //create connection using URL object
		 HttpsURLConnection httpCon = (HttpsURLConnection) link.openConnection();
		 Thread.sleep(3000);
		 //establish the connection
		 httpCon.connect();
 		 httpCon.getResponseCode();
 		 
 		 int rescode= httpCon.getResponseCode();//get response code. 
 		 //If res code greater than 400 than the link is broken
 		 
 		 if (rescode>=400) {
 			 System.out.println(url + " - " + "is broken link");
 		 }
 		 else {
 			 System.out.println(url + " - " + "is valid link");

 		 }
		 }	 
	}
}
