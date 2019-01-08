package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelRead {


	@Test
	public void readExcel() throws Exception 
	{
		
				
		/*File src=new File("D:\\AutomationPractice\\WordPressdoc.xls");
		FileInputStream fis=new FileInputStream(src);
		Workbook wordpressbook = null;
		wordpressbook = new XSSFWorkbook(fis);
		Sheet guru99Sheet = wordpressbook.getSheetAt(0);
		int rowCount = guru99Sheet.getLastRowNum()-guru99Sheet.getFirstRowNum();
		
		  for (int i = 0; i < rowCount+1; i++) {

		        Row row = guru99Sheet.getRow(i);

		        //Create a loop to print cell values in a row

		        for (int j = 0; j < row.getLastCellNum(); j++) {

		            //Print Excel data in console

		            System.out.print(row.getCell(j).getStringCellValue()+"|| ");
*/
		
		
		
		
		File src = new File("D:\\AutomationPractice\\WordPressdoc.xls");
		
		FileInputStream firststeam = new FileInputStream(src);
	
		XSSFWorkbook wb =new XSSFWorkbook(firststeam);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		String data= sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data from excel"+data);
		String data1= sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("Data from excel"+data1);
		wb.close();
		       }
		  
		  
		
	} 



