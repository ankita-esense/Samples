package TNGdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class demoDataProvider {
	
	
	@Test(dataProvider="TS")
	public void DataProvider(String username, String Password) throws InterruptedException 
	
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://www.topscorer.co.in/ts-2016/mp/");
		driver.manage().window().maximize();
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.id("btnNext")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.id("btnLogin")).click();
		
		System.out.println("The login has been done ");
		//driver.quit();
		
	}
	
	
	@DataProvider(name="TS")
	public Object[][] passdata()
	{
				
		Object[][] data = new Object[1][2];
		
		data[0][0] ="ankshah101@gmail.com";
		data[0][1] ="123456";

		
		return data;
		
		
	}
 
	
	
	

}
