package MukeshOtwani;

public class PassPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		PassPara obj1 = new PassPara();
		obj1.add(34,23);
		
		obj1.sub(65.44,54.33);
		
		DynamicCalc dy = new DynamicCalc();
		int sum =dy.add(33,34);
		System.out.println(+sum);
				
		
		String FullName =DynamicCalc.getmyfullname("dsf", "ds");
		System.out.println("dfdsf"+FullName);
		
		
	}
	
	
	
	public void add(int a, int b)
	{
		int c= a +b;
		System.out.println("The sum is " +c);
		
	}

	public void sub(double x, double y)
	
	{
		 double result = y-x;
		 System.out.println("The result is"+result);
		 
	}
	
}
