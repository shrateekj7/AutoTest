package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class ExcelReader {
	@DataProvider (name="getData")
	public static Object [][] DataSupplier() throws IOException{
	File file=new File("C:\\Users\\SHRATEEK JAISWAL\\eclipse-workspace\\TestNG\\Data\\ExcelReader.xlsx");
	FileInputStream fis=new FileInputStream(file);
	@SuppressWarnings("resource")
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	XSSFSheet sheet=workbook.getSheet("Emp");
	
	//get all rows in the sheet
	int rowCount=sheet.getLastRowNum();
	
	//get all columns in the sheet
	int colCount=sheet.getRow(0).getLastCellNum();
	System.out.println("total number of rows in excel are "+rowCount);
	System.out.println("total number of rows in excel are "+colCount);

	Object [][] data = new Object[rowCount][colCount];
	
	//DataFormatter df=new DataFormatter();
	//for iterating rows
	for (int i=0;i<rowCount;i++) {
		
		//for iterating columns
		for(int j=0;j<colCount;j++) {
		data[i][j]=sheet.getRow(i+1).getCell(j).getStringCellValue();
		//Cell value = sheet.getRow(i+1).getCell(j);
		//System.out.println(df.formatCellValue(value));
		
		
		}
	}
	return data; 
 }
	@Test(dataProvider="getData")
	public void printData(String FirstName, String LastName, String Email, String Password)
	{
		System.out.println("first name is: "+FirstName);
		System.out.println("last name is: "+LastName);
		System.out.println("email is: "+Email);
		System.out.println("password is: "+Password);
	}
}
