package LogicDev;

public class arrray {
	
	public static void main(String[] args) {

	    String[] strings = {"143","i", "love", "you", "anku", "123"};
	    int count = 0;
	    int j =0;
	     for (int i = 0; i < strings.length; i++) {
	        try {
	            j = Integer.parseInt(strings[i]);
	            count++;

	        } catch (Exception e) {

	         }
	    }
	    System.out.println("Total numaric "+count);
	    System.out.println("Total String  "+(strings.length-count));

	}


}
