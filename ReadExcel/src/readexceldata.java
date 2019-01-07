import com.library.exceldataconfig;


public class readexceldata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		exceldataconfig excel = new exceldataconfig("D:\\exceldata.xlsx");
		System.out.println(excel.getData(0, 0, 1));
		
		
		
	}

}
