package pageObjectModel;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RegistrationTest {
	@Test
	public void verifyFlightReg(){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shrateek jaiswal\\eclipse\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
	    option.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver(option);
        
        //RegistrationPage RGPage= new RegistrationPage(driver);
        RegistrationPage2 RGPage= new RegistrationPage2(driver);
        driver.get("https://demo.guru99.com/test/newtours/");
        
        RGPage.clickRegLink();
        RGPage.setFirstName("Shrateek");
        RGPage.setLastName("jasiwal");
        RGPage.setPhone("8445577641");
        RGPage.setEmail("alex@yopmail.com");
        RGPage.setAddress1("kondapur");
        RGPage.setCity("hyderabad");
        RGPage.setState("telangana");
        RGPage.setPostalCode("500084");
        RGPage.setCountry("INDIA");
        RGPage.setUserName("shreza");
        RGPage.setPassword("shreza3110@");
        RGPage.setconfirmedPassword("shreza3110@");
        RGPage.clickRegBtn();	   
        
	  }
	}
	


