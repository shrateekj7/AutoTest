import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicMenus {
static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://Selenium//Drivers//chromedriver_103.exe");

		driver=new ChromeDriver();
		
		//driver.get("https://www.hyrtutorials.com/");
		driver.get("https://jqueryui.com/droppable/");
		//driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement seleniumPractice= driver.findElement(By.xpath("//a[text()='Selenium Practice']"));
		Actions act=new Actions(driver);
		act.moveToElement(seleniumPractice).build().perform();
		act.click(seleniumPractice).build().perform();
		
		driver.switchTo().frame(0);
		driver.get("https://jqueryui.com/droppable/");
		WebElement src=driver.findElement(By.cssSelector("ui-widget-content ui-draggable ui-draggable-handle"));
		WebElement dest=driver.findElement(By.id("droppable"));
		Actions action=new Actions(driver);
		action.dragAndDrop(src, dest).build().perform();
		action.clickAndHold(src).moveToElement(dest).release().build().perform();
		action.clickAndHold(src).moveToElement(dest, 15, 50).build().perform();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightClickBtn = driver.findElement(By.xpath("//span[text() = 'right click me']"));
		WebElement doubleClickBtn = driver.findElement(By.xpath("//button[text() = 'Double-Click Me To See Alert']"));
		Actions guru = new Actions(driver);
		guru.contextClick(rightClickBtn).build().perform();
		guru.doubleClick(doubleClickBtn).build().perform();
	}

}
