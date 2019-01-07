package com.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class mobiledashboardpage {

	WebDriver driver;

	public mobiledashboardpage(WebDriver driver) {

		this.driver = driver;

	}

	public void sorting() {
		

		WebElement tt = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select"));
		tt.click();
		Select select = new Select(tt);
		select.selectByIndex(1);
		ArrayList<String> obtainedList = new ArrayList<>();
		List<WebElement> elementList = driver
				.findElements(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/ul[1]"));
		for (WebElement we : elementList) {
			obtainedList.add(we.getText());
			String s = we.getText();
			System.out.println(s);

		}
		ArrayList<String> sortedList = new ArrayList<>();
		for (String s : obtainedList) {
			sortedList.add(s);

			System.out.println(s);

		}
		Collections.sort(sortedList);
		Assert.assertTrue(sortedList.equals(obtainedList));

	}

}
