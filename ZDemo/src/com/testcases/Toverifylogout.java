/**
 * 
 */
package com.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.pages.logoutpage;
import com.utilities.BaseClass;

/**
 * @author ankitav
 *
 */
public class Toverifylogout extends BaseClass {

	@Test
	public void chklogout() {

		System.out.println(driver);
		logoutpage obj5 = new logoutpage(driver);
		obj5.logout();

	}

}
