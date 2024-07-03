package HandlingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shrateek jaiswal\\eclipse\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
	    option.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver(option);
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement element= driver.findElement(By.id("animals")); //identify the dropdown and store in some variable
        Select dd= new Select(element);
        
        //dd.selectByVisibleText("Avatar");
        //dd.selectByIndex(1);
        dd.selectByValue("big baby cat");
        System.out.println(dd.getOptions().size());
        
        //radio button
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.findElement(By.name("radiooptions")).click();
        System.out.println(driver.findElement(By.name("radiooptions")).isSelected());
        driver.navigate().back();
        
        if (driver.getTitle().contains("Automation Testing Practice"));
        {
        	System.out.println("test is passed");
        }
	}
}
