package test;
import pages.GoogleSearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest {
	
	static WebDriver driver = null;
	
	public static void main(String[] args) {
		googlesearch();
		
	}
	public static void googlesearch() {
		System.setProperty("webdriver.chrome.driver", "E:\\project\\SeleniumJavaFrameWork\\driver\\chromedriver.exe");
//		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();		
		driver.get("https://www.google.com.pk");
		
		GoogleSearchPage.textbox_search(driver).sendKeys("Javed");
		
//		GoogleSearchPage.button_search(driver).sendKeys(Key
	}
	

}
