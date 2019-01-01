package com.livegurulogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class livegurulogin {

	WebDriver driver;

	By menuaccount = By.xpath("//span[@class='label'][contains(text(),'Account')]");

	By lnkRegister = By.xpath("//a[@title='Register']");

	By txtfirstname = By.name("firstname");

	By txtMiddlename = By.name("middlename");

	By txtLastName = By.name("lastname");

	By txtemail = By.name("email");

	By txtpassword = By.name("password");

	By txtconfirmpassword = By.name("confirmation");

	By chksignup = By.name("is_subscribed");

	By btnregister = By.xpath("//span[contains(text(),'Register')]");

	public livegurulogin(WebDriver driver) {
		this.driver = driver;

	}

	public void clkaccount() {

		driver.findElement(menuaccount).click();

	}

	public void clkregister() {

		driver.findElement(lnkRegister).click();

	}

	public void setfirstname() {

		driver.findElement(txtfirstname).sendKeys("ankita");

	}

	public void setmiddlename() {

		driver.findElement(txtMiddlename).sendKeys("R");

	}

	public void setlastname() {
		driver.findElement(txtLastName).sendKeys("vaishnav");

	}

	public void setemail() {

		driver.findElement(txtemail).sendKeys("ankshah11@gmail.com");
	}

	public void setpassword()

	{
		driver.findElement(txtpassword).sendKeys("auction@123");
	}

	public void setconfirmpassword()

	{
		driver.findElement(txtconfirmpassword).sendKeys("auction@123");

	}

	public void selectcheckbox() {
		driver.findElement(chksignup).click();

	}

	public void clickregister() {

		driver.findElement(btnregister).click();
	}
	
	
	
}
