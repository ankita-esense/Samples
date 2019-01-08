package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.pages.registerpage;
import com.utilities.BaseClass;
import com.utilities.TakeSnap;
import com.utilities.helper;

public class Toverifyregistration extends BaseClass {

	By menuaccount = By.xpath("//span[@class='label'][contains(text(),'Account')]");
	By lnkRegister = By.xpath("//a[@title='Register']");

	@Test
	public void register() throws Exception {

		// System.out.println(BaseClass.driver);

		System.out.println(driver);
		registerpage obj1 = new registerpage(driver);

		driver.findElement(menuaccount).click();
		driver.findElement(lnkRegister).click();
		
		

		obj1.registrationmethod("ankita", "R", "vaishnav", "ankshah39@gmail.com", "auction@123", "auction@123");

		TakeSnap obj3 = new TakeSnap();
		obj3.takeSnapShot(driver, "D:\\test.png");

	}

	/*
	 * @AfterClass(alwaysRun = true) public void tearDown() { if (driver != null) {
	 * driver.quit(); } }
	 */

}
