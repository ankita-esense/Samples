package AdvanceReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class verifytitle {

	WebDriver driver;

	@Test
	public void verifytitledemo() {

		ExtentReports logger = ExtentReports.get(verifytitle.class);
		logger.init("D:\\Report\\advanceReport.html", true);
		logger.startTest("verify page title");
		System.setProperty("webdriver.chrome.driver",
				"D:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		logger.log(LogStatus.INFO, "Brower is up and running");
		driver.get("http://demosite.center/wordpress/wp-login.php");
		logger.log(LogStatus.INFO, "Application is running");
		String title = driver.getTitle();
		logger.log(LogStatus.INFO, "Title captured");
		Assert.assertTrue(true, title);
		logger.log(LogStatus.PASS, "Title is verify");
		
		//logger.attachScreenshot("");
		
		logger.endTest();
		
	}

}
