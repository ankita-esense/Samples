package com.wordpresspages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {

	WebDriver driver;

	By usernme = By.id("user_login");
	By password = By.id("user_pass");
	By loginbtn = By.name("wp-submit");

	public loginpage(WebDriver driver)

	{
		this.driver = driver;

	}

	public void typeUserName() {
		driver.findElement(usernme).sendKeys("admin");
	}

	public void typePassword() {
		driver.findElement(password).sendKeys("demo123");

	}

	public void loginbtn() {
		driver.findElement(loginbtn).click();
	}

	public void loginwordpress(String userid, String pwd) {

		driver.findElement(usernme).sendKeys(userid);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginbtn).click();

	}

}
