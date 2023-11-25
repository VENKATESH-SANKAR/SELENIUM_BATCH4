package org.selenium;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet; 

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Create a New Excel
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		//Create a New Sheet
		XSSFSheet sheet = workbook.createSheet("Sheet1");
		
		//Create rows and columns with data
		Row headerRow = sheet.createRow(0);
		Row headerRow1 = sheet.createRow(1);
		
		headerRow.createCell(0).setCellValue("NAME");
		headerRow.createCell(1).setCellValue("CITY");
		headerRow.createCell(2).setCellValue("GENDER");
		
		headerRow1.createCell(0).setCellValue("VENKATESH");
		headerRow1.createCell(1).setCellValue("CHENNAI");
		headerRow1.createCell(2).setCellValue("MALE");
		
		//Save the Excel File
		FileOutputStream FileOutputStream = new FileOutputStream("G:\\\\3-AUTOMATION TESTING\\\\CHROME DRIVE\\\\Excel1.xlsx");
		workbook.write(FileOutputStream);
	}

}
