package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listeners.TestNGListeners.class)
public class TestNGListenerDemo {
	@Test
	public void test1() {
		System.out.println("I am inside test 1");
	}
	@Test
	public void test2() {
		System.setProperty("webdriver.chrome.driver", "E:\\project\\SeleniumJavaFrameWork\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("http://mmaplus.rtdtradetracker.com/");
		driver.manage().window().maximize();
	    driver.findElement(By.name("userName")).click();
	    driver.findElement(By.name("userName")).clear();
	    driver.findElement(By.name("userName")).sendKeys("developer");
	    driver.findElement(By.name("passwor")).clear();
	    driver.findElement(By.name("passwor")).sendKeys("developer@1");
	    driver.findElement(By.name("passwor")).click();
	    driver.findElement(By.name("Submit")).click();
	    driver.quit();
	}
	@Test
	public void test3() {
		System.out.println("I am inside test 3");
		throw new SkipException("Test is skip");
	}
	@Test
	public void test4() {
		System.out.println("I am inside test 4");
	}

}
