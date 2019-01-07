package javab;

public class calcs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		calcs obj1 = new calcs();
		obj1.add(333,342);
		
		
		int sum = obj1.addition(33, 232);
		System.out.println("The addition is "+sum);
		
		
		calcs.sub(45,35);
		
		
		
	}

	
	
	public void add(int a, int b)
	{
		int c = a+b;
		System.out.println("The sum is "+c);

	}
	
	public static void sub(int a, int b)
	{
		int c = a-b;
		System.out.println("The sub is" +c);
		
	}
	
	public int addition(int a,int b)
	{
		int c = a+b;
		return c;
		
	}
	
	
}
