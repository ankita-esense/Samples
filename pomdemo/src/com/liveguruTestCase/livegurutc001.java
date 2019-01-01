package com.liveguruTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.livegurulogin.livegurulogin;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class livegurutc001 {

	WebDriver driver;
	static ExtentReports report;
	static ExtentTest test;

	@BeforeTest
	public void setup() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\New\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://live.guru99.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}

	@Test
	public void tcregister() throws InterruptedException {

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\Drivers\\New\\chromedriver.exe"); ChromeDriver driver = new
		 * ChromeDriver(); driver.get("http://live.guru99.com/");
		 * 
		 * driver.manage().window().maximize(); Thread.sleep(5000);
		 */

		report = new ExtentReports("D:\\ExtentReportResults.html",true);

		test = report.startTest("ExtentDemo");

		livegurulogin objlogin = new livegurulogin(driver);

		objlogin.clkaccount();
		objlogin.clkregister();
		objlogin.setfirstname();
		objlogin.setmiddlename();
		objlogin.setlastname();
		objlogin.setemail();
		objlogin.setpassword();
		objlogin.setconfirmpassword();
		objlogin.selectcheckbox();
		objlogin.clickregister();
		
		test.log(LogStatus.PASS, "Navigated to the specified URL");

	}

}
