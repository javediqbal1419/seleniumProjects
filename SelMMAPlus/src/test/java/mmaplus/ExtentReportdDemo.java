package mmaplus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportdDemo {

	static WebDriver driver = null;
	ExtentReports extent;
	ExtentHtmlReporter htmlReporter;

	@BeforeSuite
	public void setUp() {
		htmlReporter = new ExtentHtmlReporter("ExtentReports/MMAPlus.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	
	}

	@BeforeTest
	public void setUpTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\project\\SeleniumJavaFrameWork\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void logInMMA() {
		ExtentTest test = extent.createTest("Login to MMA Plus: ");
		driver.get("http://mmaplus.rtdtradetracker.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).click();
		driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("userName")).sendKeys("developer");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("developer@1122");
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("Submit")).click();
		
		
		test.log(Status.PASS, "Login Passed");
		test.log(Status.FAIL, "Login Failed");

	}

//	@Test
//	public void opertationReport() {
//		ExtentTest test = extent.createTest("Downloading Merchandiser Operation Reports: ");
//		driver.findElement(By.linkText("Operations Reports")).click();
//		driver.findElement(By.linkText("Merchandiser Daily Visit - PDF")).click();
//		driver.switchTo().frame("mainFrame");
//		driver.findElement(By.id("zoneId")).click();
//		new Select(driver.findElement(By.id("zoneId"))).selectByVisibleText("South");
//		driver.findElement(By.id("regionId")).click();
//		new Select(driver.findElement(By.id("regionId"))).selectByVisibleText("Karachi B");
//		driver.findElement(By.id("startDate")).click();
//		driver.findElement(By.linkText("26")).click();
//		driver.findElement(By.id("surveyorId")).click();
//		new Select(driver.findElement(By.id("surveyorId"))).selectByVisibleText("KHI-B001 - Tufail");
//		driver.findElement(By.id("btnId")).click();
//
//		test.pass("Operation Report Downloaded Successfully");
//		test.info("Operation Reports Info:");
//	}

	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
	}

	@AfterSuite
	public void tearDown() {
		extent.flush();

	}
}
