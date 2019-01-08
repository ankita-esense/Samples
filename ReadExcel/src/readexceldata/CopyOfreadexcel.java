package readexceldata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CopyOfreadexcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		File src = new File("D:\\exceldata.xlsx");
		
		FileInputStream firststeam = new FileInputStream(src);
	
		XSSFWorkbook wb =new XSSFWorkbook(firststeam);
		XSSFSheet sheet1 = wb.getSheetAt(0);

		int rowcount = sheet1.getLastRowNum();
		System.out.println("The count is "+rowcount);
		
		for(int i =0;i<=rowcount;i++)
		
		{
			String data =sheet1.getRow(i).getCell(0).getStringCellValue();
			
			//System.out.println("Test data from excel is "+data);
			
			System.out.println("data from row" + i + " " +"is"+"  "+ data);
		
		}
		
		wb.close();
		
		
	}

}
