package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class dashboard {

	 WebDriver driver;

	 public dashboard(WebDriver driver) {
		 this.driver = driver;
	}

		// By usernme =By.id("user_login");

		static By btncustomize = By.xpath("//a[contains(text(),'WordPress 5.0.1')]");
		
	public  void clickcustomize()
	{
		
		System.out.println(driver);
		driver.findElement(btncustomize).click();
	}
	
	
	

}
