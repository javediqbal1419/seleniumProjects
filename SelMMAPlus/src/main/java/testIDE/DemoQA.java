package testIDE;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoQA {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeTest
  public void setUp() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "E:\\project\\SeleniumJavaFrameWork\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testDemoQA() throws Exception {
    driver.get("https://demoqa.com/");
    driver.findElement(By.linkText("Sortable")).click();
    driver.findElement(By.xpath("//ul[@id='sortable']/li/span")).click();
    driver.findElement(By.linkText("Selectable")).click();
    driver.findElement(By.linkText("Resizable")).click();
    driver.findElement(By.id("content")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Resizable'])[2]/following::div[2]")).click();
    driver.findElement(By.linkText("Droppable")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Droppable'])[2]/following::p[1]")).click();
    driver.findElement(By.linkText("Draggable")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Draggable'])[2]/following::p[1]")).click();
    driver.findElement(By.linkText("HTML contact form")).click();
    driver.findElement(By.xpath("//input[@type='text']")).click();
    driver.findElement(By.xpath("//input[@type='text']")).clear();
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("javed");
    driver.findElement(By.id("lname")).click();
    driver.findElement(By.id("lname")).clear();
    driver.findElement(By.id("lname")).sendKeys("IQBAL");
    driver.findElement(By.name("country")).click();
    driver.findElement(By.name("country")).clear();
    driver.findElement(By.name("country")).sendKeys("Pakistan");
    driver.findElement(By.id("subject")).click();
    driver.findElement(By.id("subject")).clear();
    driver.findElement(By.id("subject")).sendKeys("Write");
    driver.findElement(By.linkText("Keyboard Events")).click();
    driver.findElement(By.id("browseFile")).click();
    driver.findElement(By.id("uploadButton")).click();
    assertEquals(closeAlertAndGetItsText(), "Thanks, you have selected  file to Upload");
    driver.findElement(By.linkText("Tooltip")).click();
    driver.findElement(By.id("age")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='We ask for your age only for statistical purposes.'])[1]/following::div[2]")).click();
    driver.findElement(By.linkText("Tooltip")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Keyboard Events Sample Form'])[1]/following::a[1]")).click();
    driver.findElement(By.id("doubleClickBtn")).click();
    driver.findElement(By.id("doubleClickBtn")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=doubleClickBtn | ]]
    assertEquals(closeAlertAndGetItsText(), "Double Click Alert\n\nHi,You are seeing this message as you have double cliked on the button");
    driver.findElement(By.id("rightClickBtn")).click();
    driver.findElement(By.id("rightClickBtn")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=rightClickBtn | ]]
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Export'])[1]/following::span[1]")).click();
    driver.findElement(By.linkText("Spinner")).click();
    driver.findElement(By.xpath("//div[@id='content']/div[2]/p/span/a[2]/span")).click();
    driver.findElement(By.xpath("//div[@id='content']/div[2]/p/span/a[2]/span")).click();
    driver.findElement(By.xpath("//div[@id='content']/div[2]/p/span/a/span")).click();
    driver.findElement(By.xpath("//div[@id='content']/div[2]/p/span/a/span")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | //div[@id='content']/div[2]/p/span/a/span | ]]
    driver.findElement(By.xpath("//div[@id='content']/div[2]/p/span/a/span")).click();
    driver.findElement(By.id("disable")).click();
    driver.findElement(By.id("destroy")).click();
    driver.findElement(By.id("getvalue")).click();
    driver.findElement(By.id("setvalue")).click();
    driver.findElement(By.linkText("Button")).click();
    driver.findElement(By.xpath("//input[@value='A submit button']")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Widget Buttons'])[1]/following::button[1]")).click();
    driver.findElement(By.linkText("An anchor")).click();
    driver.findElement(By.xpath("(//input[@value='A submit button'])[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='CSS Buttons'])[1]/following::button[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='A button element'])[2]/following::a[1]")).click();
    driver.findElement(By.linkText("Autocomplete")).click();
    driver.findElement(By.id("tags")).click();
    driver.findElement(By.id("ui-id-2")).click();
    driver.findElement(By.id("tags")).clear();
    driver.findElement(By.id("tags")).sendKeys("ColdFusion");
  }

  @AfterTest(alwaysRun = true)
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
