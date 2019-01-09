package redbus;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RedBudTkt extends BrowserFactory{
	
	
	@Test
	public void booktkt() throws InterruptedException
	{
	
	    /* WebElement mySelectElement = driver.findElement(By.xpath("//input[@id='src']"));
		 Select dropdown= new Select(mySelectElement);
		 dropdown.selectByIndex(2); // value is QTP
	 */
		 
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("A");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[2]/main[1]/section[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[3]")).click();
		
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("M");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[2]/main[1]/section[1]/div[1]/div[2]/section[1]/div[1]/div[2]/div[1]/ul[1]/li[3]")).click();
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[7]/table[1]/tbody[1]/tr[4]/td[3]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[2]/main[1]/section[1]/div[1]/div[2]/section[1]/div[1]/div[4]/div[1]/label[1]")).click();
		//driver.findElement(By.xpath("/html[1]/body[1]/div[7]/table[1]/tbody[1]/tr[4]/td[3]")).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[7]/table[1]/tbody[1]/tr[4]/td[3]")).click();
		
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		
		Thread.sleep(10000);
		//driver.findElement(By.xpath("//li[@class='checkbox selected']//label[@class='custom-checkbox']")).click();
		
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[2]/li[4]/label[1]")).click();
		Thread.sleep(5000);
	//	driver.findElement(By.xpath("//ul[@class='list-chkbox']//li[3]//label[1]")).click();
		
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[3]/li[3]/label[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[4]/li[1]/label[1]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='details']//div[5]//input[1]")).click();
		Thread.sleep(5000);
		
		//driver.switchTo().frame(0);
		
		driver.switchTo().activeElement();
		//driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/ul[1]/li[2]/label[1]")).click();
		
		driver.findElement(By.xpath("//div[@class='filter-popup']//input[@placeholder='BOARDING POINT']")).sendKeys("aditi");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/ul[1]/li[2]/label[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='button btn-apply bp-apply']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='DROPPING POINT']")).click();
		driver.switchTo().activeElement();
		
		driver.findElement(By.xpath("//div[@class='filter-popup']//input[@placeholder='DROPPING POINT']")).sendKeys("Andheri");
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[8]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/ul[1]/li[2]/label[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='button btn-apply dp-apply']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='OPERATOR']")).click();
		Thread.sleep(5000);
		driver.switchTo().activeElement();
		driver.findElement(By.xpath("//div[@class='filter-popup']//input[@placeholder='OPERATOR']")).sendKeys("New");
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[10]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/ul[1]/li[2]/label[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='button btn-apply op-apply']")).click();
		Thread.sleep(5000);
		
		// amities are the disable hence not able to select it. 
		
		//driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[5]/li[1]/span[1]")).click();
		
		driver.findElement(By.xpath("//li[@id='10974052']//div[@class='button view-seats fr'][contains(text(),'View Seats')]")).click();
		
		Thread.sleep(10000);
		
		//driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div[1]/li[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/canvas[1]")).click();
		
		//driver.findElement(By.xpath("//canvas[@data-type='lower']")).g
		
		
		    Actions ToolTip1 = new Actions(driver); 
		   WebElement element = driver.findElement(By.xpath("//canvas[@data-type='lower']")); 
		   Thread.sleep(2000); 
		   ToolTip1.moveToElement(element).moveByOffset(419,211).click().perform(); 
		   String ToolTipText = element.getText(); 
		    System.out.println("Tooltip value is: " + ToolTipText); 
		
		//driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div[1]/li[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]")).click();
		
		
		//driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div[1]/li[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]")).click();
		
		
		
		
		
	}
		
	
	
	
	
	      
	
	
}
