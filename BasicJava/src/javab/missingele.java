package javab;

public class missingele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int[] ints = {1, 2, 3, 4, 6,7,9,11,13};
	    for (int i = 0; i < ints.length - 1; i++) {

	        if ((ints[i + 1] - ints[i]) > 1) {
	           System.out.println("Missing elements is :"+(ints[i]+1));

	        }

	    }

	}

}
