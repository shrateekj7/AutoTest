import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InternAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F://Selenium//Driver//chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://sakshingp.github.io/assignment/login.html");
		driver.manage().window().maximize();//maximize window
		System.out.println(driver.getTitle());//gets title of the page
		
		//username & password in lower case(id & pass same)
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("shrateekj");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("shrateekj");
		driver.findElement(By.xpath("//button[@id='log-in']")).click();
		
		//username & password in lower case(different id & pass)
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("shrateekj");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("jaiswal");
		driver.findElement(By.xpath("//button[@id='log-in']")).click();

		//username & password in upper case(id & pass same)
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("SHRATEEKJ");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SHRATEEKJ");
		driver.findElement(By.xpath("//button[@id='log-in']")).click();
		
		//username & password in upper case(different id & pass)
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("SHRATEEKJ");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("JAISWAL");
		driver.findElement(By.xpath("//button[@id='log-in']")).click();
		
		//username & password in lower and upper case(id & pass same)
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("SHRAteekj");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SHRAteekj");
		driver.findElement(By.xpath("//button[@id='log-in']")).click();
		
		//username & password in lower and upper case(different id & pass)
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("SHRAteekj");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("shraTEEKJ");
		driver.findElement(By.xpath("//button[@id='log-in']")).click();
		
		//username & password in alpha-numeric(id & pass same)
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("SHRAteekj7");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SHRAteekj7");
		driver.findElement(By.xpath("//button[@id='log-in']")).click();
		
		//username & password in alpha-numeric(different id & pass)
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("SHRAteekj7");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("shraTEEKJ7");
		driver.findElement(By.xpath("//button[@id='log-in']")).click();
		
		//username & password in alpha-numeric + symbols(id & pass same)
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("SHRAteekj7$$$");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("shraTEEKJ7$$$");
		driver.findElement(By.xpath("//button[@id='log-in']")).click();
		
		//username & password in alpha-numeric + symbols(different id & pass)
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("SHRAteekj7$$$");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("shraTEEKJ7###");
		//while selecting the check box 'remember me'
		driver.findElement(By.xpath("//label[@class='form-check-label']")).click();
		driver.findElement(By.xpath("//button[@id='log-in']")).click();
		
		//logging in with only numbers(id & pass same)
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='log-in']")).click();
		
		//logging in with numbers & symbols(different id & pass)
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("!@#$");
		driver.findElement(By.xpath("//button[@id='log-in']")).click();
		
		//logging in with only symbols (id & pass same)
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("!@#$");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("!@#$");
		driver.findElement(By.xpath("//button[@id='log-in']")).click();
		
		//logging in with symbols & numbers(different id & pass)
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("!@#$");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='log-in']")).click();
		
		//logging in without entering valid inputs
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("");
		driver.findElement(By.xpath("//button[@id='log-in']")).click();
		
		//logging in without password
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("shrateekj");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("");
		driver.findElement(By.xpath("//button[@id='log-in']")).click();
		
		//logging in without username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("shrateekj");
		driver.findElement(By.xpath("//button[@id='log-in']")).click();
		
		//After successful login into the application,click the AMOUNT header in the transaction table and check the values are sorted

		driver.findElement(By.xpath("//th[@id='amount']")).click();
		
		//the values are sorted successfully 
		
	}

}
