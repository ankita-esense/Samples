package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utilities.helper;

public class logoutpage {

	public WebDriver driver;
	
	int $;
	
	

	public logoutpage(WebDriver driver) {

		this.driver = driver;

	}

	public void logout() {

		WebElement MenuAccount = driver.findElement(By.xpath("//span[@class='label'][contains(text(),'Account')]"));

		WebElement lnklogout = driver.findElement(By.xpath("//a[@title='Log Out']"));

		helper.highLightElement(driver, MenuAccount);
		MenuAccount.click();

		helper.highLightElement(driver, lnklogout);
		lnklogout.click();

	}

}
