package MukeshOtwani;

public class demoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fullname = "Selenium-HP-QTP-Grid";
		
		String []toolname = fullname.split("-");
		
		for(int i=0;i<=toolname.length;i++)
		{
			System.out.println(toolname[i]);
			
			if(toolname[i].equals("Selenium"))
			{
				System.out.println("TestOPass");
				break;
				
			}
			
		}

	}

}
