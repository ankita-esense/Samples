/**
 * 
 */
package com.wordpresspages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Admin
 *
 */
public class pageloginnew {

	WebDriver driver;

	public pageloginnew(WebDriver iddriver) {

		this.driver = iddriver;

	}

	@FindBy(id = "user_login")
	WebElement username;

	@FindBy(how = How.ID, using = "user_pass")
	@CacheLookup
	WebElement password;

	@FindBy(how = How.NAME, using = "wp-submit")
	@CacheLookup
	WebElement loginbutton;

	@FindBy(how = How.LINK_TEXT, using = "Lost your password?")
	@CacheLookup
	WebElement forget_password_link;

	public void loginwordpress(String userid, String pwd) {
		username.sendKeys(userid);
		password.sendKeys(pwd);
		loginbutton.click();

	}

}
