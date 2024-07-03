package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shrateek jaiswal\\eclipse\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.opencart.com/index.php?route=account/register");

        //getting data from excel sheet
		FileInputStream file=new FileInputStream ("C:\\Users\\Shrateek jaiswal\\eclipse-workspace\\SampleData");
		//get workbook instance for XSL file
		XSSFWorkbook  workbook = new XSSFWorkbook(file);
		//get sheet from workbook
		XSSFSheet sheet=workbook.getSheet("Salesorders");
		//get first row from sheet
		int noofRows= sheet.getLastRowNum();
		System.out.println("Number of rows:" + noofRows);
		
		for (int row =1; row< noofRows; row++) {
			XSSFRow current_row = sheet.getRow(row);
			
			String First_name = current_row.getCell(0).getStringCellValue();
			String Second_name = current_row.getCell(1).getStringCellValue();
			String Phone = current_row.getCell(2).getStringCellValue();
			String Email = current_row.getCell(3).getStringCellValue();
			String City = current_row.getCell(4).getStringCellValue();
			String Country = current_row.getCell(5).getStringCellValue();
			String State = current_row.getCell(6).getStringCellValue();
			String Pincode = current_row.getCell(7).getStringCellValue();
			String Username = current_row.getCell(8).getStringCellValue();
			String Password = current_row.getCell(9).getStringCellValue();


			//registration process
			driver.findElement(By.linkText("REGISTER")).click();
			
			//entering contact information
			driver.findElement(By.name("firstName")).sendKeys(First_name);
			driver.findElement(By.name("lastName")).sendKeys(Second_name);
			driver.findElement(By.name("phone")).sendKeys(Phone);
			driver.findElement(By.name("userName")).sendKeys(Email);
			
			//entering mailing information
			driver.findElement(By.name("cityName")).sendKeys(City);
			driver.findElement(By.name("countryName")).sendKeys(Country);
			driver.findElement(By.name("stateName")).sendKeys(State);
			driver.findElement(By.name("pincode")).sendKeys(Pincode);

			//country selection
			Select dropdowncountry = new Select(driver.findElement(By.name("countryName")));
			dropdowncountry.selectByVisibleText(Country);
			
			//entering user information
			driver.findElement(By.name("email")).sendKeys(Username);
			driver.findElement(By.name("password")).sendKeys(Password);
			driver.findElement(By.name("confirmPassword")).sendKeys(Password);
	
			//submitting forms
			driver.findElement(By.name("register")).click();
			
			if(driver.getPageSource().contains("Thank you for registering")) {
				System.out.println("registration successful for " + row + "record" );
			}else {
				System.out.println("registration failed for" + row + "record");
			}
		}
	}
}
