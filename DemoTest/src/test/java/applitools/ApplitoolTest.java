package applitools;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.Eyes;

public class ApplitoolTest {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\project\\seleniumProjects\\SelMMAPlus\\driver\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.get("https://applitools.com/helloworld");
		try {
		Eyes eyes = new Eyes();
		eyes.setApiKey("hDT2cvy8b2Wo1Qqc03GcIFloGUzeSQrDmp0PQxd52eA110");
		eyes.open(driver, "HelloWorld!", "My first java test",
				new RectangleSize(800, 600));
		driver.get("https://applitools.com/helloworld");
		eyes.checkWindow("Hellow!");
		driver.findElement(By.tagName("button")).click();
		eyes.checkWindow("Click!");
	}finally {
		driver.close();
	}
}
}