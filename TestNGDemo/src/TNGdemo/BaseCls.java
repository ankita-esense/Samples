package TNGdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

  class BaseCls extends BaseClass {

		
	@Test
	public void logintoapp() throws InterruptedException
	{
		
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.name("username")).sendKeys("ankshah101@gmail.com");
		driver.findElement(By.id("btnNext")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.id("btnLogin")).click();
		System.out.println("The login has been done ");
	
		
		
	}
	
		
}

 


