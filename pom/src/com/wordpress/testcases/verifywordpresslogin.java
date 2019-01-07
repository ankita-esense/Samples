/**
 * 
 */
package com.wordpress.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.wordpresspages.CopyOfloginpage1;
import com.wordpresspages.loginpage;

/**
 * @author Admin
 *
 */
public class verifywordpresslogin {
	
	@Test
	public void verifyvalidlogin()
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		loginpage login = new loginpage(driver);
		
//		login.typeUserName();
//		login.typePassword();
//		login.loginbtn();
		
		login.loginwordpress("admin", "demo123");
		//CopyOfloginpage1 login1 = new CopyOfloginpage1((driver)
				
		
//		
		driver.quit();
	}

}
