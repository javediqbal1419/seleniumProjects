package demoQA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
 
public class DragAndDrop3 {
 
	public static void main(String[] args) throws InterruptedException {
		
 		//Note: Following statement is required since Selenium 3.0, 
    		//optional till Selenium 2.0
    		//Set system properties for geckodriver 
//		String projectPath = System.setProperty("user.id", arg1)
    		System.setProperty("webdriver.gecko.driver", "E:\\project\\seleniumProjects\\SelMMAPlus\\driver\\geckodriver.exe");		
 
		WebDriver driver = new FirefoxDriver();
		 
		String URL = "https://demoqa.com/draggable/";
		 
		driver.get(URL);
		 
		// It is always advisable to Maximize the window before performing DragNDrop action		 
		driver.manage().window().maximize();
		 
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		
		//Actions class method to drag and drop			
		Actions builder = new Actions(driver);
		 
		WebElement from = driver.findElement(By.id("draggable"));
		
		//Perform dragAndDropBy 
		builder.dragAndDropBy(from, 100,100).perform();		

		System.out.println("Dropped");

		driver.close();

	}
	
 
}
