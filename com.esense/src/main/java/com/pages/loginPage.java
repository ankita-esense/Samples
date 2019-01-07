package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class loginPage {
	
	
	WebDriver driver;
	
	By usernme =By.id("user_login");
	By password = By.id("user_pass");
	By loginbtn = By.name("wp-submit");
	
	
	public loginPage(WebDriver driver)
	
	{
		this.driver=driver;
		
	}
	
	
	public void typeUserName()
	{
		driver.findElement(usernme).sendKeys("admin");
	}

	
	public void typePassword()
	{
		driver.findElement(password).sendKeys("demo123");
		
	}

	public void loginbtn()
	{
		driver.findElement(loginbtn).click();
	}
	
	
	public void loginwordpress()
	{
		
		driver.findElement(usernme).sendKeys("admin");
		driver.findElement(password).sendKeys("demo123");
		driver.findElement(loginbtn).click();
		
	}

}
