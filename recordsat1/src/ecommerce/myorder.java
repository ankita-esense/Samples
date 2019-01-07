package ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class myorder extends browserfactory {

	@Test
	public void myorder() throws InterruptedException {

		// System.out.println("hello");

		driver.findElement(
				By.xpath("//div[@class='col-sm-6 col-md-6 col-lg-5 text-right hidden-xs pull-right pl-0']//input[@placeholder='Search']"))
				.sendKeys("abcd");
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div[@class='col-sm-6 col-md-6 col-lg-5 text-right hidden-xs pull-right pl-0']//input[@placeholder='Search']"))
				.sendKeys(Keys.ENTER);

		Thread.sleep(5000);
		WebElement element = driver
				.findElement(By
						.xpath("//li[@class='menu_item_list_c main-wrapper-links-withoutImage']//a[@class='main_menu_list text-uppercase font-bold']"));

		Actions action = new Actions(driver);

		action.moveToElement(element).build().perform();

		driver.findElement(
				By.xpath("//a[@class='desktop_sub_menu_a_link'][contains(text(),'Dresses')]"))
				.click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//label[@for='price_range3']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//label[@for='custom_cat1']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//label[@for='categorytype1']")).click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(10000);
		System.out.println("dgdg");
		driver.findElement(By.xpath("//img[@title='BLACK']")).click();
		System.out.println("sdfsfs");
		Thread.sleep(7000);
		driver.findElement(By.xpath("//label[@for='size3']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//label[@for='sleeve_length2']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//label[@for='occassions1']")).click();
		driver.findElement(
				By.xpath("//span[@class='slider round fast_dis_on_off']"))
				.click();
		driver.findElement(By.xpath("//label[@for='fast2']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'apply')]"))
				.click();
		Select dropdown = new Select(driver.findElement(By.id("productsort")));
		dropdown.selectByVisibleText("Lowest Price");
		driver.findElement(By.xpath("//*[contains(@id,'cartBtn')]")).click();
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/section[3]/section[1]/div[3]/div[2]/div[2]/div[2]/ul[1]/li[1]/div[2]/span[1]/span[1]/label[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(@id,'cartBtn')]")).click();

	}

}
