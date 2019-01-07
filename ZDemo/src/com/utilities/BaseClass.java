package com.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseClass {

	public static WebDriver driver;

	@BeforeSuite
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\New\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://live.guru99.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@AfterSuite
	public void quitdriver()
	{
		driver.quit();
	}

}
