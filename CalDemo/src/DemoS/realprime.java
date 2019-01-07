package DemoS;

public class realprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =191;
		int i;
		String ex ="";
		int exi=0;
		for(i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				ex=ex+i+"";
				exi=exi+i;
				System.out.println(ex);
				System.out.println(exi);

				
				

			}
		
		}
		 
		if(exi==num)
		{
			System.out.println("The number is prime");
		}
		else
		{
			System.out.println("The number is not prime");
		}
		
		
	}

}
