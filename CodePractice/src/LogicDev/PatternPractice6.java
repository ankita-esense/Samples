package LogicDev;

public class PatternPractice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int k=0;

	    //printf("Enter number of rows: ");
	    //scanf("%d",&rows);

	    for(int i=1; i<=5; i++, k=0)
	    {
	        for(int j=1; j<=5-i; j++)
	        {
	            System.out.print(" ");
	        }
	        
	        while(k != 2*i-1)
	        {
	            System.out.print("*");
	            k++;
	        }

	        System.out.print("\n");
	    }
	    
	    
	}

}
