package com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

	WebDriver ldriver;
	public LogInPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	@FindBy(name="userName")
	@CacheLookup
	WebElement txtUserName;
	public void setUserName(String u_name) {
		txtUserName.sendKeys(u_name);
		
	}
	
}
