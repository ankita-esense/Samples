package LogicDev;

import java.util.Scanner;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your number :: ");  
		int i = input.nextInt(); 
		
		
		if(i%2==0)
		{
			System.out.print("Yes It is Even");
		}
		else
		{
			System.out.println("Yes, it is odd number");
		}
			
	}
		
}


