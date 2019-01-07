package com.wordpress.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.utilities.Browserfactory;
import com.wordpresspages.pageloginnew;

public class verfyvalidlogin {
	
	@Test
	public void checkvaliduser()
	
	{
	
		// This will launch browser and specific url
		WebDriver driver =Browserfactory.startbrowser("chrome","http://demosite.center/wordpress/wp-login.php");
		
		
		pageloginnew login_page= PageFactory.initElements(driver, pageloginnew.class);
		
		login_page.loginwordpress("admin","demo123");
		
	}
	
	

}
