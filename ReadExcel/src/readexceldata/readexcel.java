package readexceldata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		File src = new File("D:\\exceldata.xlsx");
		
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
