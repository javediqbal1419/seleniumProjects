package mmaplus;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdminMMA {

	static WebDriver driver = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\project\\SeleniumJavaFrameWork\\driver\\chromedriver.exe");
		driver = new ChromeDriver();		
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
	    
	    
	    driver.findElement(By.linkText("Admin")).click();
	    driver.findElement(By.linkText("Add Emails")).click();
	    // Switch frame
	    driver.switchTo().frame("mainFrame");
	    new Select(driver.findElement(By.id("emailType"))).selectByVisibleText("OOS Distributional Emails");
	    driver.findElement(By.id("zoneId")).click();
	    new Select(driver.findElement(By.id("zoneId"))).selectByVisibleText("South");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.id("regionId")).click();
	    new Select(driver.findElement(By.id("regionId"))).selectByVisibleText("Karachi A");
	    driver.findElement(By.id("asmType")).click();
	    new Select(driver.findElement(By.id("asmType"))).selectByVisibleText("Npl");
	}
}
