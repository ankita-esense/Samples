package com.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.loginPage;

public class Baseclass {

	WebDriver driver;
	
	@Test(priority = 1)
	public void setup()
	{
		
	
	System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://demosite.center/wordpress/wp-login.php");
	  
		loginPage obj1 = new loginPage(driver);
		
		obj1.loginwordpress();  
					
		}
	}
