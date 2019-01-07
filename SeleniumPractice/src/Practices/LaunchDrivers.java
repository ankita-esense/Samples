package Practices;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchDrivers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//To enter login
		
		driver.findElement(By.name("uid")).sendKeys("mngr165946");
		// TO enter password
		driver.findElement(By.name("password")).sendKeys("bAsAjYv");
		
		// To click on login 
		driver.findElement(By.name("btnLogin")).click();
		
		// To get the title
		String actualTitle = driver.getTitle();
		
		
		System.out.println(actualTitle);
		
		//To store my website title 
		String ExpectedTitle = "Guru99 Bank Manager HomePage";
		
		System.out.println(actualTitle);
		
		// To compare title   . The exception will occur if both are not same.
		assertEquals(actualTitle, ExpectedTitle);
	
		
		}
	
	
		
}
