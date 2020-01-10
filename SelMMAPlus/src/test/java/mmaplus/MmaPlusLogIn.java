package mmaplus;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MmaPlusLogIn {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	  driver = new ChromeDriver();	
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testMmaPlusLogIn() throws Exception {
    driver.get("http://mmaplus.rtdtradetracker.com/");
    driver.findElement(By.name("userName")).click();
    driver.findElement(By.name("userName")).clear();
    driver.findElement(By.name("userName")).sendKeys("developer");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("developer@1122");
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("Submit")).click();
    driver.findElement(By.linkText("Admin")).click();
    driver.findElement(By.linkText("Download Route Files")).click();
    
    driver.switchTo().frame("mainFrame");
    
    driver.findElement(By.id("regionId")).click();
    new Select(driver.findElement(By.id("regionId"))).selectByVisibleText("Lahore A");
    driver.findElement(By.id("regionId")).click();
    driver.findElement(By.xpath("//body")).click();
    driver.findElement(By.linkText("1")).click();
    driver.findElement(By.xpath("//body")).click();
    driver.findElement(By.linkText("27")).click();
    driver.findElement(By.id("btnId")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
