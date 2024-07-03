package DataDrivenTesting;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writingData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream file=new FileOutputStream ("C:\\Users\\Shrateek jaiswal\\eclipse-workspace\\SampleData");

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Sheet1");//creating new sheet
		
		for (int i=0; i<=5; i++) {
			XSSFRow row=sheet.createRow(i);
			for (int j=0; j<3; j++) {
			row.createCell(j).setCellValue("xyz");	
			}
		}
		workbook.write(file);
		file.close();
		System.out.println("written data into excel is completed ");
	}
}
