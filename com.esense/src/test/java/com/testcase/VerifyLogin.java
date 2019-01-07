package com.testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.pages.loginPage;

public class VerifyLogin{
	
	WebDriver driver;
	
  @Test()
  public void f() {
	  
	loginPage obj1 = new loginPage(driver);
	
	obj1.loginwordpress();  
	  
  }
}
