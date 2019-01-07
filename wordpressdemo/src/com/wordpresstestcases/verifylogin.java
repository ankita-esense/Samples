package com.wordpresstestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.com.baseclass.browserfactory;

import com.wordpresspages.loginpage;

public class verifylogin extends browserfactory {

//	WebDriver driver;
	
	

	@Test()
	public void f() {
		
		
		System.out.println(driver);
		
		loginpage obj1 = new loginpage(driver);
		obj1.loginwordpress("admin", "demo123");

	}

}
