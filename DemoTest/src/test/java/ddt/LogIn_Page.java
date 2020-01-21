package ddt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn_Page {
	 
    private static WebElement element = null;

public static WebElement txtbx_UserName(WebDriver driver){

     element = driver.findElement(By.name("userName"));
     Log.info("Username text box found");

     return element;

     }

 public static WebElement txtbx_Password(WebDriver driver){

     element = driver.findElement(By.name("password"));
     Log.info("Password text box found");

     return element;

     }

 public static WebElement btn_LogIn(WebDriver driver){

     element = driver.findElement(By.name("login"));
     Log.info("Submit button found");

     return element;

     }

}
