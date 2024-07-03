package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {
	
	public static void main(String []args)  throws IOException{
	File file=new File("C:\\Users\\SHRATEEK JAISWAL\\eclipse-workspace\\TestNG\\Data\\ExcelReader.xlsx");
	FileInputStream fis=new FileInputStream(file);
	@SuppressWarnings("resource")
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	XSSFSheet sheet=workbook.getSheet("Emp");
	
	XSSFCell cell=sheet.getRow(1).createCell(5);
	cell.setCellValue("PASS");
	
	FileOutputStream outputStream=new FileOutputStream("C:\\Users\\SHRATEEK JAISWAL\\eclipse-workspace\\TestNG\\Data\\ExcelReader.xlsx");
	workbook.write(outputStream);
	
	System.out.println("excel written");
	}
}
