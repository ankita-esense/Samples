package TNGdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	
WebDriver driver;
	
	@BeforeMethod
	public void setupapp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\New\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://www.topscorer.co.in/ts-2016/mp/");
		driver.manage().window().maximize();
		
		
	}
		
	@AfterMethod
	public void closeapp()
	{
		
		driver.quit();
		Reporter.log("Application closed",true);		
		
	}
	

}
