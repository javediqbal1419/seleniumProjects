package mmaplus;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MmaPlusOperationReports {
	
	static WebDriver driver = null;
	ExtentReports extent;
	ExtentHtmlReporter htmlReporter;

	@BeforeSuite
	public void setUp() {
		htmlReporter = new ExtentHtmlReporter("ExtentReports/MMAPlus1.html");
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

		test.pass("Login Successfully");
		test.info("This Login success info:");
		test.warning("This is warning ");

	}

	@Test
	public void abNormalShopList() {
		ExtentTest test = extent.createTest("Abnormal Shop List Report: ");
		driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Out of Stock Summary'])[2]/following::span[1]"))
				.click();
		driver.findElement(By.linkText("Abnormal Shop List")).click();
		driver.switchTo().frame("mainFrame");
		driver.findElement(By.id("actionType")).click();
		new Select(driver.findElement(By.id("actionType"))).selectByVisibleText("Regional");
		driver.findElement(By.id("actionType")).click();
		driver.findElement(By.id("rCount")).click();
		driver.findElement(By.id("rCount")).click();
		driver.findElement(By.id("zoneId")).click();
		new Select(driver.findElement(By.id("zoneId"))).selectByVisibleText("Center");
		driver.findElement(By.id("zoneId")).click();
		driver.findElement(By.id("regionId")).click();
		new Select(driver.findElement(By.id("regionId"))).selectByVisibleText("Lahore A");
		driver.findElement(By.id("regionId")).click();
		driver.findElement(By.id("startDate")).click();
		driver.findElement(By.linkText("1")).click();
		driver.findElement(By.id("endDate")).click();
		driver.findElement(By.linkText("30")).click();
		driver.findElement(By.id("btnId")).click();
		test.pass("Abnormal Shop List Successfully Downloaded");
		test.info("This Login success info:");
	}

	// switch to Side Menu frame

	public void outOfStockSummary() {
		ExtentTest test = extent.createTest("Out of Stock Summary Reports: ");

		driver.switchTo().frame("furl");
		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Trade'])[1]/following::b[1]")).click();
		driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Out of Stock Summary'])[2]/following::span[1]"))
				.click();
		driver.switchTo().frame("mainFrame");
		driver.findElement(By.linkText("ASM Daily Visit - PDF")).click();
		driver.switchTo().frame("mainFrame");
		driver.findElement(By.id("zoneId")).click();
		new Select(driver.findElement(By.id("zoneId"))).selectByVisibleText("Center");
		driver.findElement(By.id("zoneId")).click();
		driver.findElement(By.id("regionId")).click();
		new Select(driver.findElement(By.id("regionId"))).selectByVisibleText("Lahore A");
		driver.findElement(By.id("regionId")).click();
		driver.findElement(By.id("startDate")).click();
		driver.findElement(By.linkText("25")).click();
		driver.findElement(By.id("surveyorId")).click();

		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='ASM:'])[1]/following::i[1]"))
				.click();
		test.pass("Login Successfully");
		test.info("This Login success info:");
	}

	// Side Menu Frame
	@Test
	public void attendanceReport() {
		ExtentTest test = extent.createTest("Attendance Reports Downloading: ");
		driver.switchTo().frame("furl");
		driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Out of Stock Summary'])[2]/following::span[1]"))
				.click();
		driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Out of Stock Summary'])[2]/following::span[1]"))
				.click();
		driver.findElement(By.linkText("Attendance Report")).click();
		driver.switchTo().frame("mainFrame");
		driver.findElement(By.id("zoneId")).click();
		new Select(driver.findElement(By.id("zoneId"))).selectByVisibleText("South");
		driver.findElement(By.id("zoneId")).click();
		driver.findElement(By.id("regionId")).click();
		new Select(driver.findElement(By.id("regionId"))).selectByVisibleText("Karachi B");
		driver.findElement(By.id("regionId")).click();
		driver.findElement(By.id("attendanceType")).click();
		new Select(driver.findElement(By.id("attendanceType"))).selectByVisibleText("Audit");
		driver.findElement(By.id("attendanceType")).click();
		driver.findElement(By.id("startDate")).click();
		driver.findElement(By.linkText("1")).click();
		driver.findElement(By.xpath("//body")).click();
		driver.findElement(By.linkText("30")).click();
		driver.findElement(By.id("btnId")).click();
		test.pass("Attendance Reports  Successfully Downloaded");
		test.info("This Login success info:");
	}

	@Test
	public void distributionCheckInReport() {
		ExtentTest test = extent.createTest("Distribution Check In Reports Downloading : ");

		// Side Menu Frame
		driver.switchTo().frame("furl");

		driver.findElement(By.linkText("DistributionCheckIn")).click();
		driver.switchTo().frame("mainFrame");
		driver.findElement(By.id("startDate")).click();
		driver.findElement(By.linkText("1")).click();
		driver.findElement(By.id("endDate")).click();
		driver.findElement(By.linkText("30")).click();
		driver.findElement(By.id("btnId")).click();
		test.pass("DistributionCheckIn Downloaded Successfully");
		test.info("This Login success info:");
	}

	@Test
	public void downloadCurrentRouteShop() {
		ExtentTest test = extent.createTest("Download Current Route Shop List Reports: ");

		// Side Menu Frame
		driver.switchTo().frame("furl");
		driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Out of Stock Summary'])[2]/following::span[1]"))
				.click();
		driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Out of Stock Summary'])[2]/following::span[1]"))
				.click();
		driver.findElement(By.linkText("Download Current Route Shops")).click();
		driver.switchTo().frame("mainFrame");
		driver.findElement(By.id("actionType")).click();
		new Select(driver.findElement(By.id("actionType"))).selectByVisibleText("Regional");
		driver.findElement(By.id("actionType")).click();
		driver.findElement(By.id("zoneId")).click();
		new Select(driver.findElement(By.id("zoneId"))).selectByVisibleText("South");
		driver.findElement(By.id("zoneId")).click();
		driver.findElement(By.id("regionId")).click();
		new Select(driver.findElement(By.id("regionId"))).selectByVisibleText("Karachi B");
		driver.findElement(By.id("regionId")).click();
		driver.findElement(By.id("btnId")).click();
		test.pass("Current Route Shop List Reports Downloaded Successfully");
		test.info("This Login success info:");
	}

	@Test
	public void opertionReportsPdf() {
		ExtentTest test = extent.createTest("Operation Report Downloading : ");

		// Side Menu Frame
		driver.switchTo().frame("furl");

		driver.findElement(By.linkText("Operations Reports")).click();
		driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Out of Stock Summary'])[2]/following::span[1]"))
				.click();
		driver.findElement(By.linkText("Merchandiser Daily Visit - PDF")).click();
		driver.switchTo().frame("mainFrame");
		driver.findElement(By.id("zoneId")).click();
		new Select(driver.findElement(By.id("zoneId"))).selectByVisibleText("South");
		driver.findElement(By.id("zoneId")).click();
		driver.findElement(By.id("regionId")).click();
		new Select(driver.findElement(By.id("regionId"))).selectByVisibleText("Karachi B");
		driver.findElement(By.id("regionId")).click();
		driver.findElement(By.id("startDate")).click();
		driver.findElement(By.linkText("25")).click();
		driver.findElement(By.id("surveyorId")).click();
		test.pass("Operation Report Downloaded Successfully");
		test.info("This Login success info:");
	}

	@Test
	public void merchandiserProductivityReport() {
		ExtentTest test = extent.createTest("Merchandiser Productivity Reports Downloading : ");

		// Side Menu Frame
		driver.switchTo().frame("furl");

		driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Out of Stock Summary'])[2]/following::span[1]"))
				.click();
		driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Out of Stock Summary'])[2]/following::span[1]"))
				.click();
		driver.findElement(By.linkText("Merchandiser Productivity Report")).click();
		driver.switchTo().frame("mainFrame");
		driver.findElement(By.id("zoneId")).click();
		new Select(driver.findElement(By.id("zoneId"))).selectByVisibleText("Center");
		driver.findElement(By.id("zoneId")).click();
		driver.findElement(By.id("regionId")).click();
		new Select(driver.findElement(By.id("regionId"))).selectByVisibleText("Lahore A");
		driver.findElement(By.id("regionId")).click();
		driver.findElement(By.id("startDate")).click();
		driver.findElement(By.linkText("1")).click();
		driver.findElement(By.id("endDate")).click();
		driver.findElement(By.linkText("30")).click();
		driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Remove Impact:'])[1]/following::button[1]"))
				.click();
		driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='None selected'])[1]/following::label[1]"))
				.click();
		driver.findElement(By.xpath("//form[@id='merchActivityReportForm']/table")).click();
		driver.findElement(By.id("btnId")).click();
		test.pass("Merchandiser Productivity Reports Downloaded Successfully");
		test.info("This Login success info:");
	}

	@Test
	public void nationalShopVisitSummary() {
		ExtentTest test = extent.createTest("National Shop Visit Summary Report Downloading: ");

		// Side Menu Frame
		driver.switchTo().frame("furl");

		driver.findElement(By.linkText("National Shops Visit-Summary")).click();
		driver.switchTo().frame("mainFrame");
		driver.findElement(By.id("actionType")).click();
		new Select(driver.findElement(By.id("actionType"))).selectByVisibleText("Zonal");
		driver.findElement(By.id("actionType")).click();
		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Channels:'])[1]/following::button[1]"))
				.click();
		driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='None selected'])[1]/following::label[1]"))
				.click();
		driver.findElement(By.id("zoneId")).click();
		new Select(driver.findElement(By.id("zoneId"))).selectByVisibleText("Center");
		driver.findElement(By.id("zoneId")).click();
		driver.findElement(By.id("startDate")).click();
		driver.findElement(By.linkText("1")).click();
		driver.findElement(By.id("endDate")).click();
		driver.findElement(By.linkText("30")).click();
		driver.findElement(By.id("btnId")).click();
		test.pass("National Shop Visit Summary Report Downloaded Successfully");
		test.info("This Login success info:");
	}

	@Test
	public void regionalMerchandiserDailySummary() {
		ExtentTest test = extent.createTest("Regional Merchandiser Daily Summary Report Downloading : ");

		// Side Menu Frame
		driver.switchTo().frame("furl");

		driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Out of Stock Summary'])[2]/following::span[1]"))
				.click();
		driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Out of Stock Summary'])[2]/following::span[1]"))
				.click();
		driver.findElement(By.linkText("Regional Merch Daily Summary")).click();
		driver.switchTo().frame("mainFrame");
		driver.findElement(By.id("zoneId")).click();
		new Select(driver.findElement(By.id("zoneId"))).selectByVisibleText("South");
		driver.findElement(By.id("zoneId")).click();
		driver.findElement(By.id("regionId")).click();
		new Select(driver.findElement(By.id("regionId"))).selectByVisibleText("Karachi B");
		driver.findElement(By.id("regionId")).click();
		driver.findElement(By.id("startDate")).click();
		driver.findElement(By.id("endDate")).click();
		driver.findElement(By.id("btnId")).click();
		test.pass("Regional Merchandiser Daily Summary Report Downloaded Successfully");
		test.info("This Login success info:");
	}

	@Test
	public void shopComparisonPdf() {
		ExtentTest test = extent.createTest("Shop Comparison Report Downloading : ");

		// Side Menu Frame
		driver.switchTo().frame("furl");

		driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Out of Stock Summary'])[2]/following::span[1]"))
				.click();
		driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Out of Stock Summary'])[2]/following::span[1]"))
				.click();
		driver.findElement(By.linkText("Shop Comparison pdf")).click();
		driver.switchTo().frame("mainFrame");
		driver.findElement(By.id("shopId")).click();
		driver.findElement(By.id("actionType")).click();
		new Select(driver.findElement(By.id("actionType"))).selectByVisibleText("By Visits");
		driver.findElement(By.id("actionType")).click();
		driver.findElement(By.id("shopId")).click();
		driver.findElement(By.id("shopId")).clear();
		driver.findElement(By.id("shopId")).sendKeys("121212");
		driver.findElement(By.id("lastVisit")).click();
		new Select(driver.findElement(By.id("lastVisit"))).selectByVisibleText("1");
		driver.findElement(By.id("lastVisit")).click();
		driver.findElement(By.id("btnLink")).click();
		test.pass("Shop Comparison Report Downloaded Successfully");
		test.info("This Login success info:");
	}

	@Test
	public void shopVisitDetail() {

		ExtentTest test = extent.createTest("Shop Visit Detail Reports Downloading : ");
		// Side Menu Frame
		driver.switchTo().frame("furl");

		driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Out of Stock Summary'])[2]/following::span[1]"))
				.click();
		driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Out of Stock Summary'])[2]/following::span[1]"))
				.click();
		driver.findElement(By.linkText("Shop Visit Detail")).click();
		driver.switchTo().frame("mainFrame");
		driver.findElement(By.id("actionType")).click();
		new Select(driver.findElement(By.id("actionType"))).selectByVisibleText("Zonal");
		driver.findElement(By.id("actionType")).click();
		driver.findElement(By.id("zoneId")).click();
		new Select(driver.findElement(By.id("zoneId"))).selectByVisibleText("South");
		driver.findElement(By.id("zoneId")).click();
		driver.findElement(By.id("startDate")).click();
		driver.findElement(By.linkText("1")).click();
		driver.findElement(By.id("endDate")).click();
		driver.findElement(By.linkText("30")).click();
		driver.findElement(By.id("btnId")).click();
		test.pass("Shop Visit Detail Reports Downloaded Successfully");
		test.info("This Login success info:");
	}

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