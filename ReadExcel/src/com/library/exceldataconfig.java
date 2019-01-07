package com.library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceldataconfig {
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public exceldataconfig(String excelpath)
	{
	try {
		File src = new File(excelpath);
			
			FileInputStream firststeam = new FileInputStream(src);
		
			 wb =new XSSFWorkbook(firststeam);
			
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 

	}
	
	public String getData(int i,int row,int column)
	{
		
		sheet1 = wb.getSheetAt(0);
		String data =sheet1.getRow(row).getCell(column).getStringCellValue();
		return data;
		
		
	}

}
