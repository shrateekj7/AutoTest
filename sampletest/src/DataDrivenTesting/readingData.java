package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class readingData{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream file=new FileInputStream ("C:\\Users\\Shrateek jaiswal\\eclipse-workspace\\SampleData");
		
		XSSFWorkbook  workbook = new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Salesorders");//providing sheet name
		//XSSFSheet sheet=workbook.getSheetAt(1); ---- providing sheet index
		
		int rowcount=sheet.getLastRowNum(); //returns row count
		System.out.println("rowcount is :" + rowcount);
		int cellcount=sheet.getRow(0).getLastCellNum(); //returns cell count
		System.out.println("cellcount is:" + cellcount);
		
		for (int i=0; i<rowcount;i++) {
			XSSFRow currentrow=sheet.getRow(i);
			
			for(int j=0; j<cellcount; j++) {
				String value=currentrow.getCell(j).toString(); // read value from cell(generic method--reads all types of data)
				System.out.println(value);
			}
		}
	}

}
