package MukeshOtwani;

public class CopyOfPassPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CopyOfPassPara obj1 = new CopyOfPassPara();
		int sum =obj1.add(34,23);
		System.out.println(+sum);
		
		
		
	}
	
	
	public int add(int a, int b)
	{
		int c= a +b;
		return c;
		
	}

	public void sub(double x, double y)
	
	{
		 double result = y-x;
		 System.out.println("The result is"+result);
		 
	}
	
}
