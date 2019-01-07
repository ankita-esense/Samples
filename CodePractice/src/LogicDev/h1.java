package LogicDev;

public class h1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	main = new Main();
	  //  main.evenAndOdd();

		
		h1.evenAndOdd();
	

	}
	
	public static  void evenAndOdd() {
	    String s1 = "";
	    String s2 = "";

	    for (int i = 1; i <= 10; i++) {

	        if (i % 2 == 0) {
	            s1 = s1 + "," + i + "";
	        } else {

	            s2 = s2 + "," + i + "";
	        }
	    }
	    System.out.println("List of even numbers :" + s1);
	    System.out.println("List of odd numbers :" + s2);

	}

}
