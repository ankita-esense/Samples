package DemoS;

import java.util.Scanner;

public class AgainCalDemo {
	public static void main(String[] args) {
		String theCase ="";
		int a=400; int b=500;
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the operator");
		  theCase=scanner.nextLine();
			int c=0;
			switch (theCase) {
			case "+":
				c=a+b;
	 			System.out.println(a+" + "+b+" = "+c);
	 			break;
	       case "*":
				c=a*b;
				System.out.println(a+" * "+b+" ="+c);
	 			break;

	      case "/":
				c=a/b;
				System.out.println(a+" / "+b+" = "+c);

		   break;

	      case "-":
				c=a-b;
				System.out.println(a+" - "+b+" = "+c);
	 
		  break;
			default:
				System.out.println("Input valid number");
				break;
			}
			scanner.close();
	
	}
	

}
