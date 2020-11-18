package com.qa.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.pages.BaseClass;
import com.qa.pages.LoginPage;

public class LoginTest extends BaseClass {

	@Test
	public void loginApp() {

		logger = report.createTest("Login to guru99");
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		logger.info("Strat Application");

		loginPage.LoginGuru99(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));

		logger.pass("Login is successfull");
	}

	@Test
	public void Logout() {
		logger = report.createTest("Logout Application");
		
		logger.fail("logout failed");
		
		
	}
}
