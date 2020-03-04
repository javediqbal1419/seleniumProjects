package com.testCases;

import org.testng.annotations.Test;

import com.pageObject.LogInPage;

public class TC_LogIn_001 extends BaseClass {
	
	@Test
	public void loginTest() throws Exception {
		LogInPage lp = new LogInPage(driver);
		
		lp.setUserName(username);
		
	}

}
