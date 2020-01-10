package ndn;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NdnDsrSaleReports {
	static WebDriver driver = null;
	ExtentReports extent;
	ExtentHtmlReporter htmlReporter;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeSuite
	public void setUp() {
		htmlReporter = new ExtentHtmlReporter("ExtentReports/NDN.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}

	@BeforeTest
	public void setUpTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\project\\SeleniumJavaFrameWork\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test(priority = 1)
	public void ndnLoginPage(){
		ExtentTest test = extent.createTest("NDN Login Page : ");
		driver.get("http://ndn1.concavetech.com/dist/#/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("mat-input-0")).click();
		driver.findElement(By.id("mat-input-0")).clear();
		driver.findElement(By.id("mat-input-0")).sendKeys("qamar");
		driver.findElement(By.id("mat-input-1")).clear();
		driver.findElement(By.id("mat-input-1")).sendKeys("qamar@333");
		driver.findElement(By.xpath("//button")).click();
		test.pass("NDN Login Successfully");
		test.info("NDN Reports Info:");
	}
	@Test	
	public void ndnSaleReport() {
		ExtentTest test = extent.createTest("Downloading NDN Operation Reports: ");
		driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sales Data'])[1]/following::mat-icon[1]"))
				.click();
		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sales Data'])[1]/following::span[1]"))
				.click();
		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='DEC'])[1]/following::div[1]")).click();
		driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Choose a end date'])[1]/following::*[name()='svg'][1]"))
				.click();
		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='DEC'])[1]/following::div[27]")).click();
		driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Choose a end date'])[1]/following::span[3]"))
				.click();
		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='South'])[1]/following::span[1]"))
				.click();
		driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Selected Region'])[1]/following::span[2]"))
				.click();
		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Faisalabad B'])[1]/following::span[1]"))
				.click();
		driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Selected Territory'])[1]/following::span[2]"))
				.click();
		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Download'])[1]/following::span[1]"))
				.click();
		driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Select Measurment'])[1]/following::div[1]"))
				.click();
		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Download'])[1]/following::span[1]"))
				.click();
		driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Select Measurment'])[1]/following::span[2]"))
				.click();
		test.pass("Operation Report Downloaded Successfully");
		test.info("Operation Reports Info:");
	}

	@AfterTest
	public void tearDownTest() {
//		driver.close();
//		driver.quit();
	}

	@AfterSuite
	public void tearDown() {
		extent.flush();
	}
}