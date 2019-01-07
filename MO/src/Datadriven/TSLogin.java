package Datadriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TSLogin {

	
	@Test(dataProvider="TS")
	public void logintoTS(String username,String passwrd) throws InterruptedException
	{
		
		String exepath ="D:\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exepath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.topscorer.com");
		Thread.sleep(1000);
	//	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("emailId")).sendKeys(username);
		driver.findElement(By.id("btnNext")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(
		ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		driver.findElement(By.name("password")).sendKeys(passwrd);
		driver.findElement(By.id("btnLogin")).click();
		//Thread.sleep(500);
		System.out.println(driver.getTitle());
		//driver.quit();
				
	}
	
	
	@DataProvider(name="TS")
	public Object[][] passData()
	{
		
		Object[][] data = new Object[1][2];
		
		data[0][0] ="swapnil@esense.in";
		data[0][1] ="123456";
		
		
		
		return data;
		
	}
		
}
