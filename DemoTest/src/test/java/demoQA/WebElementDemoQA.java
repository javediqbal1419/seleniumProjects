package demoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementDemoQA {

	public static void main(String[] args) {
		// Create a new instance of the FireFox driver
		String driverExecutablePath = "E:\\project\\seleniumProjects\\DemoTest\\driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverExecutablePath);
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();

		// Open ToolsQA web site
//		driver.get("http://shop.demoqa.com");
		driver.get("https://www.toolsqa.com/automation-practice-form");
		// to clear webElements
//		WebElement element = driver.findElement(By.id("UserName"));
//		element.clear();
//		//Or can be written as
//		driver.findElement(By.id("UserName")).clear();
//		
//		WebElement element1 = driver.findElement(By.id("UserName"));
//		element1.sendKeys("ToolsQA");
//
//		//Or can be written as
//
//		driver.findElement(By.id("UserName")).sendKeys("ToolsQA");
//		
//		WebElement element2 = driver.findElement(By.id("UserName"));
//		boolean status = element2.isDisplayed();

		//Or can be written as

//		boolean status1 = driver.findElement(By.id("UserName")).isDisplayed();
//		System.out.println(status1);
//		
//		WebElement element3 = driver.findElement(By.id("Sex-Male"));
//		boolean status3 = element3.isSelected();
//
//		//Or can be written as
//
//		boolean staus4 = driver.findElement(By.id("Sex-Male")).isSelected();
//		
//		WebElement element5 = driver.findElement(By.id("SubmitButton"));
//		element5.submit();
//
//		//Or can be written as
//
//		driver.findElement(By.id("SubmitButton")).submit();
		
		//Element Size
		WebElement element6 = driver.findElement(By.id("buttonwithclass"));
		Dimension dimensions = element6.getSize();
		System.out.println("Height :" + dimensions.height + "    Width : "+ dimensions.width);
		
		
		WebElement element7 = driver.findElement(By.id("buttonwithclass"));
		Point point = element7.getLocation();
		System.out.println("X cordinate : " +point.x + "      Y cordinate: " +point.y);
	}

}
