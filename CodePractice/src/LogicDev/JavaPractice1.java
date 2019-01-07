package LogicDev;

import java.util.Scanner;

public class JavaPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your number :: ");  
		int i = input.nextInt(); 
		
		System.out.println("You have entered this number ::" + i);
	
		
		//THis is how to use ternerty operator :: Combine of three operator at the same time.
		
		
		String evenodd = (i %2 == 0) ? "even " : "odd";
		
		System.out.println("num is"  + evenodd );
		
	}

}
