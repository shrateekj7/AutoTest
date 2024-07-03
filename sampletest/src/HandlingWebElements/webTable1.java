package HandlingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class webTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shrateek jaiswal\\eclipse\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
	       option.addArguments("--remote-allow-origins=*");
	       WebDriver driver = new ChromeDriver(option);
	        
	       driver.get("file:///C:/Users/Shrateek%20jaiswal/Downloads/index.html");
	      int r= driver.findElements(By.xpath("html/body/table/tbody/tr")).size();
	       System.out.println("number of rows : " + r);
	      int c= driver.findElements(By.xpath("html/body/table/tbody/tr/th")).size();
	      System.out.println("number of columns : " + c);  
	      
	      for (int i=2; i<=r; i++) {
	    	  for (int j=1; j<=c;j++){
	    		 System.out.println(driver.findElement(By.xpath("html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText()+"  "); 
	    	  }
	      }System.out.println();
	}
}
