package com.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pages.dashboard;
import com.pages.loginPage;

public class verifydashboard extends Baseclass{


	@Test(priority = 2)
	public void verifyDashboard() {
		
/*		loginPage obj1 = new loginPage(driver);
		System.out.println(driver);
		obj1.loginwordpress("admin", "demo123");
*/
		dashboard obj2 = new dashboard(driver);
		obj2.clickcustomize();
	}
}
