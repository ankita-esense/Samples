package MukeshOtwani;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String actuals  = "welcome to selenium webdrivver";
	String expected   = "welcome to selenium webdrivver";
	
	//boolean status2 = actuals.equals(expected);
	
	boolean status2 = actuals.contains(expected);
	
	System.out.println("Status is " + status2);
	
	}
	
	

}
