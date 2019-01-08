package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utilities.BaseClass;
import com.utilities.helper;

public class registerpage {

	WebDriver driver;

	public registerpage(WebDriver driver) {

		this.driver = driver;

	}

	public void registrationmethod(String Firstname, String Middlename, String Lastname, String email, String password,
			String Confirmpassword) {

		WebElement txtfirstname = driver.findElement(By.name("firstname"));

		WebElement txtMiddlename = driver.findElement(By.name("middlename"));

		WebElement txtLastName = driver.findElement(By.name("lastname"));

		WebElement txtemail = driver.findElement(By.name("email"));

		WebElement txtpassword = driver.findElement(By.name("password"));

		WebElement txtconfirmpassword = driver.findElement(By.name("confirmation"));

		WebElement chksignup = driver.findElement(By.name("is_subscribed"));

		WebElement btnregister = driver.findElement(By.xpath("//span[contains(text(),'Register')]"));

		helper.highLightElement(driver, txtfirstname);
		txtfirstname.sendKeys(Firstname);
		helper.highLightElement(driver, txtMiddlename);
		txtMiddlename.sendKeys(Middlename);
		helper.highLightElement(driver, txtLastName);
		txtLastName.sendKeys(Lastname);
		helper.highLightElement(driver, txtemail);
		txtemail.sendKeys(email);
		helper.highLightElement(driver, txtpassword);
		txtpassword.sendKeys(password);
		helper.highLightElement(driver, txtconfirmpassword);
		txtconfirmpassword.sendKeys(Confirmpassword);
		helper.highLightElement(driver, chksignup);
		chksignup.click();
		helper.highLightElement(driver, btnregister);
		btnregister.click();

		
		
	}

}
