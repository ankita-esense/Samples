package com.utilities;

import org.apache.bcel.generic.RETURN;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserfactory {

	
	static WebDriver driver;
	public static WebDriver startbrowser(String browsername,String url)
	{
		
		if(browsername.equals("Firefox"))
		{
			
			driver= new FirefoxDriver();
			
		}
		
		else if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
		
		
	}
	
	
}
