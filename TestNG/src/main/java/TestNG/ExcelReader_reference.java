package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader_reference {

	public static void main(String[] args) throws IOException {

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

		//for iterating rows
		for (int i=0;i<rowCount;i++) {
			
			//for iterating columns
			for(int j=0;j<colCount;j++) {
				System.out.println(sheet.getRow(i+1).getCell(j).getStringCellValue());;
			}
		}
	}

}
