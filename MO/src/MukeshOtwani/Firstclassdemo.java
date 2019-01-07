package MukeshOtwani;

public class Firstclassdemo {

	
	int x= 90;
	int y = 100;
	public static void main(String[] args) {
		
		// data member or properties
		
		
		System.out.println("Program started");
		// TODO Auto-generated method stub
		Firstclassdemo obj1 = new Firstclassdemo();
		
		Firstclassdemo obj2 = new Firstclassdemo();
		
		obj1.sum();
		System.out.println("end program");
		
		System.out.println("This is x value" +obj1.x);
		System.out.println("This is Y value" +obj1.y);
		
		
	}

	public void sum()
	{
	
		int a = 90;
		int b = 100;
		int c = b + a;
		System.out.println("THe sum is " +c);

		
		
	}

}
