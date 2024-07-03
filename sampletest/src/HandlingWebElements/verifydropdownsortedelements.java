package HandlingWebElements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.netty.util.internal.SystemPropertyUtil;

public class verifydropdownsortedelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shrateek jaiswal\\eclipse\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
	    option.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver(option);
        driver.get("https://testautomationpractice.blogspot.com/");
        
        WebElement element= driver.findElement(By.id("animals")); //identify the dropdown and store in some variable
        Select dd= new Select(element);
        List originalList = new ArrayList();
        List tempList = new ArrayList();

        List <WebElement> options = dd.getOptions();
        for (WebElement e: options) {
        	originalList.add(e.getText());
        	tempList.add(e.getText());
        }
        System.out.println("before sorting: " + originalList);
    	//tempList = originalList;
    	System.out.println("Before sorting :" + tempList);
    	
    	Collections.sort(tempList);
    	
        System.out.println("After sorting: " + originalList);
    	System.out.println("After sorting :" + tempList);
    	if(originalList == tempList) {
    		System.out.println("Elements are sorted");
    	} else {
    		System.out.println("Elements not sorted");
    	}
	}
}
