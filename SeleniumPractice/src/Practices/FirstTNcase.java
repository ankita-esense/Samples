package Practices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(Practices.TestNGListner.class)
public class FirstTNcase {
	
	@Test
	
	public void goolgetitleverify()
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		driver.manage().window().maximize();
		String obj =driver.getTitle();
		System.out.println("The title is"+obj);
		driver.quit();
		
	}
	
	@Test
	public void titlematch()
	{
		System.out.println("Test case failed");
		Assert.assertTrue(false);

	}
	
	
	
	
	
}
