package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TPLinkDemo {

	
static WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\project\\seleniumProjects\\SelMMAPlus\\driver\\chromedriver.exe");
		driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	}
	@Test
	public void logInMMA() {
		driver.get("http://javed:ayyan1419@192.168.0.1/");
		driver.manage().window().maximize();
		String text = ((WebElement) driver.findElements(By.cssSelector("pointer"))).getText();
		System.out.println(text);
//		driver.findElement(By.id("ol46")).click();
//		driver.findElement(By.name("userName")).clear();
//		driver.findElement(By.name("userName")).sendKeys("developer");
//		driver.findElement(By.name("password")).clear();
//		driver.findElement(By.name("password")).sendKeys("developer@1122");
//		driver.findElement(By.name("password")).click();
//		driver.findElement(By.name("password")).click();
//		driver.findElement(By.name("Submit")).click();
	}
	@AfterTest
	public void tearDownTest() {
//		driver.close();
//		driver.quit();
		System.out.println("Test Completed Successfully : ");
	}
}
