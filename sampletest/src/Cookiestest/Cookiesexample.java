package Cookiestest;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Cookiesexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shrateek jaiswal\\eclipse\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.amazon.in/");
		Set <Cookie> cookies = driver.manage().getCookies(); //capture all cookies from browser
		System.out.println("size of cookies: " + cookies.size());
		/*for (Cookie cookie:cookies) //read and print all the cookies
		  {
		 System.out.println(cookie.getName() + "  " + cookie.getValue()); // print name and values of cookies
			
		System.out.println(driver.manage().getCookieNamed("i18n-prefs")); //print specific cookies acc to name */
		
		Cookie cobject = new Cookie("Mycookie1234", "123456789");
		driver.manage().addCookie(cobject);
		cookies = driver.manage().getCookies(); 
		System.out.println("size of cookies: " + cookies.size());

		for (Cookie cookie:cookies) {
			System.out.println(cookie.getName() + "  " + cookie.getValue());
		}
		
		driver.manage().deleteCookie(cobject);
		cookies=driver.manage().getCookies();
		System.out.println("size of cookies: " + cookies.size());

		for (Cookie cookie:cookies) {
			System.out.println(cookie.getName() + "  " + cookie.getValue());
		}
		driver.manage().deleteAllCookies();
		cookies=driver.manage().getCookies();
		System.out.println("size of cookies: " + cookies.size());
		
		//adding new cookie to the browser
		Cookie cookojb =new Cookie ("Mycookie777","123123123");
		driver.manage().addCookie(cookojb); //add new cookie to browser
		
		cookies=driver.manage().getCookies();
		System.out.println("size of cookies" + cookies.size());
		
		for (Cookie cookie:cookies) {
			System.out.println(cookie.getName() + "  " + cookie.getValue());
		}
	
		//deleting single cookie
		driver.manage().deleteCookie(cookojb);
		cookies=driver.manage().getCookies();
		System.out.println("size of cookies: " + cookies.size());
		
		//delete all cookies
		driver.manage().deleteAllCookies();
		cookies=driver.manage().getCookies();
		System.out.println("size of cookies: " + cookies.size());

	}
	
}
