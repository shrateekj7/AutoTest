package DataDrivenTesting;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writingData2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream file=new FileOutputStream ("C:\\Users\\Shrateek jaiswal\\eclipse-workspace\\SampleData");

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet1=workbook.createSheet("Sheet1");//creating new sheet
		XSSFSheet sheet2=workbook.createSheet("Sheet2");//creating new sheet

		for (int i=0; i<=5; i++) {
			XSSFRow row1=sheet1.createRow(i);
			XSSFRow row2=sheet2.createRow(i);

			for (int j=0; j<3; j++) {
			row1.createCell(j).setCellValue("xyz");	
			row2.createCell(j).setCellValue("abc");	

			}
		}
		
		System.out.println("written data into excel is completed ");
	}
}
