package redbus;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

public class BrowserFactory {
	
	public static WebDriver driver;

	@BeforeClass
	public void setup() throws Exception {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.redbus.in/");
	Thread.sleep(1000);
	driver.manage().window().maximize();
	Thread.sleep(5000);
		
	/*	ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(options);
	
*/
		}
}
