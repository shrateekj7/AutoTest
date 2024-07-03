package HashMap;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginTestHM {

	
	static HashMap <String, String> logindata(){
		
		HashMap <String,  String> hm = new HashMap <String, String>();
		hm.put("x", "username@password");
		hm.put("y", "username1@password1");
		hm.put("z", "username2@password2");
		
		return hm;
		
	}
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shrateek jaiswal\\eclipse\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
	    option.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver(option);
	    driver.get("https://demo.guru99.com/test/newtours/");
	    
	    //Login as X
	    String credentials = logindata().get("x");
	    String arr[] = credentials.split("@");
	    driver.findElement(By.name("userName")).sendKeys(arr[0]);
	    driver.findElement(By.name("password")).sendKeys(arr[1]);
	    driver.findElement(By.name("submit")).click();
	    
	    if (driver.getTitle().equals("Login: Mercury Tours")) {
	    	System.out.println("Test is passed");
	    }
	    else {
	    	System.out.println("Test is failed");
	    }
	}

}
