package Redbusdemopkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class bookseat extends browserfactory {

	@Test
	public void seatbooking() throws InterruptedException
	{
		
		//driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Ahmedbad");
		
		
		WebElement from = driver.findElement(By.xpath("//input[@id='src']"));
		from.clear();
		from.sendKeys("A");
		driver.findElement(By.xpath("//input[@id='dest']"));
		Thread.sleep(2000);
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[9]/ul/li")));
		driver.findElement(By.xpath("html/body/div[9]/ul/li")).click();

		
	}
	
}
