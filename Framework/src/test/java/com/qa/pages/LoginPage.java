package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	@FindBy(name = "uid")
	WebElement uname;

	@FindBy(name = "password")
	WebElement pass;

	@FindBy(name = "btnLogin")
	WebElement loginButton;

	public void LoginGuru99(String usernameApplication, String passwordApplication) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}

		uname.sendKeys(usernameApplication);
		pass.sendKeys(passwordApplication);
		loginButton.click();
	}
}
