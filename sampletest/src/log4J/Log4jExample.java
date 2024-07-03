package log4J;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.opentelemetry.api.logs.Logger;

public class Log4jExample {

	public static void main(String[]args) {
	//here we need to create logger instance so we need to pass Class name
	//Logger logger = Logger.getLogger("Log4jExample");
	// DOMConfiguration.configure("Log4j.xml");
	// PropertyConfiguration.configure("Log4j.properties");
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shrateek jaiswal\\eclipse\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
	    option.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver(option);
	    
	  //  logger.info("open broswer");
	    driver.get("www.google.com");
	
	}
}
