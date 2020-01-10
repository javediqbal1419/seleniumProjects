package mmaplus;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import pages.GoogleSearchPage;

public class LogIn {
	
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
	    
	  //Assume driver is initialized properly. 
	    List<WebElement> ele = driver.findElements(By.tagName("iframe"));
	    System.out.println("Number of frames in a page :" + ele.size());
	    for(WebElement el : ele){
	      //Returns the Id of a frame.
	        System.out.println("Frame Id :" + el.getAttribute("id"));
	      //Returns the Name of a frame.
	        System.out.println("Frame name :" + el.getAttribute("name"));
	    }
	    
//	    int esize = driver.findElements(By.tagName("iframe")).size();
//	    String frameName = driver.findElements(By.tagName("iframe")).getClass();
//	    System.out.println(esize);
	    
//	    driver.findElement(By.linkText("Admin")).click();
//	    driver.findElement(By.linkText("Add Emails")).click();
//	    driver.findElement(By.linkText("Download Route Files")).click();
	    
	    // Switch frame
//	    driver.switchTo().frame("mainFrame");
//	    new Select(driver.findElement(By.id("emailType"))).selectByVisibleText("OOS Distributional Emails");
//	    driver.findElement(By.id("regionId")).click();
//	    new Select(driver.findElement(By.id("regionId"))).selectByVisibleText("Lahore A");
//	    driver.findElement(By.id("regionId")).click();
//	    driver.findElement(By.xpath("//body")).click();
//	    driver.findElement(By.linkText("1")).click();
//	    driver.findElement(By.xpath("//body")).click();
//	    driver.findElement(By.linkText("27")).click();
//	    driver.findElement(By.id("btnId")).click();
	}

}
