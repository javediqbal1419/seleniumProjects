package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

public class ExcelDataProvider {
	WebDriver driver = null;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:\\project\\SeleniumJavaFrameWork\\driver\\chromedriver.exe");
		driver = new ChromeDriver();		
		
	}
	@Test(dataProvider = "test1data")
	public void test1(String userName, String passWord) {
		System.out.println(userName+" | "+passWord);
		driver.get("http://mmaplus.rtdtradetracker.com/");
		driver.manage().window().maximize();
	    driver.findElement(By.name("userName")).click();
	    driver.findElement(By.name("userName")).clear();
	    driver.findElement(By.name("userName")).sendKeys(userName);
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys(passWord);
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).click();
		
	}
	@DataProvider(name = "test1data")
	public Object[] [] getData() {
		String excelPath = "E:\\project\\selenium4\\excel\\data.xlsx";
		Object data[][] = testData(excelPath, "Sheet1");
		return data;
	}

	public  Object[][] testData(String excelPath, String sheetName) {
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		Object data [][] = new Object [rowCount-1][colCount];
		
		for(int i = 1; i < rowCount; i++) {
			for(int j = 0; j <colCount; j++) {
				String cellData = excel.getCellDataString(i, j);
//				System.out.print(cellData+"       | ");
				data[i-1][j] = cellData;
				
			}
//			System.out.print("\n");
		}
		return data;
	}
}
