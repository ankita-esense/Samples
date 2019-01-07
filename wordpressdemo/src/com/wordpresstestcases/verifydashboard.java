package com.wordpresstestcases;

import org.testng.annotations.Test;

import com.com.baseclass.browserfactory;
import com.wordpresspages.dashboardpage;
import com.wordpresspages.loginpage;

public class verifydashboard extends browserfactory {

	@Test()
	public void f() {
		
		dashboardpage obj2 = new dashboardpage(driver);
		obj2.clickcustomize();
	}

	
}
