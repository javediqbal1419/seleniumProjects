package mmaplus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OperationReportPDF {
	
	static WebDriver driver = null;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\project\\SeleniumJavaFrameWork\\driver\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://mmaplus.rtdtradetracker.com/");
		driver.manage().window().maximize();
	    driver.findElement(By.name("userName")).click();
	    driver.findElement(By.name("userName")).clear();
	    driver.findElement(By.name("userName")).sendKeys("----");
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("-----");
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("Submit")).click();
	    /*
	     * 
	     */
	    
	    driver.findElement(By.linkText("Operations Reports")).click();
	    driver.findElement(By.linkText("Merchandiser Daily Visit - PDF")).click();
	    driver.switchTo().frame("mainFrame");
	    driver.findElement(By.id("zoneId")).click();
	    new Select(driver.findElement(By.id("zoneId"))).selectByVisibleText("South");
//	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.id("regionId")).click();
	    new Select(driver.findElement(By.id("regionId"))).selectByVisibleText("Karachi B");
	    driver.findElement(By.id("startDate")).click();
	    driver.findElement(By.linkText("26")).click();
//	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.id("surveyorId")).click();
	    new Select(driver.findElement(By.id("surveyorId"))).selectByVisibleText("KHI-B001 - Tufail");
	    driver.findElement(By.id("btnId")).click();
	    
	    

	}

}
 