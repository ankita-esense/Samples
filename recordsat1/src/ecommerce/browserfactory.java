package ecommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class browserfactory {

	protected WebDriver driver;

	@BeforeClass
	public void setup() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.stalkbuylove.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

	}

}
