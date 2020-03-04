package com.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readConfig = new ReadConfig();
	public String baseURL=readConfig.getApplicationURL();
	public String username=readConfig.getUsername();
	public static WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver",readConfig.getChromePath());
		driver=new ChromeDriver();
	}
	
	@AfterClass
	public void tearDown() {
//		driver.close();
	}

}
