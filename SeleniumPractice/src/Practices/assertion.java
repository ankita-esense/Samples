package Practices;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertion {
	
	@Test
	public void test1()
	{
		
	Assert.assertEquals(12, 13);	
		
	
//	assert.assertTrue(true);
	}
	
	@Test
	public void test11()
	{
		
	Assert.assertEquals(12, 13,"sdfdsfsfsfsfdsfsfsffsfsfdsfdsfdsf");	
		
	}

	
	@Test
	public void test11q()
	{
		
	System.out.println("Test case started");
	Assert.assertEquals("Hello", "Heelo","words does not match raise bug");	
	System.out.println("test case failed");
	}
	

	
	
}




