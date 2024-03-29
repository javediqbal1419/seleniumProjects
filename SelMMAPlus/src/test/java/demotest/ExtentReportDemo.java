package demotest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo 
{

	@Test
	public void loginTest() throws IOException
	{    
            // Create Object of ExtentHtmlReporter and provide the path where you want to generate the report 
            // I used (.) in path where represent the current working directory
	    ExtentHtmlReporter reporter=new ExtentHtmlReporter("ExtentReports/demotest.html");
		
            // Create object of ExtentReports class- This is main class which will create report
	    ExtentReports extent = new ExtentReports();
	    
            // attach the reporter which we created in Step 1
	    extent.attachReporter(reporter);
	    
            // call createTest method and pass the name of TestCase- Based on your requirement
	    ExtentTest logger=extent.createTest("LoginTest");
	    
            // log method will add logs in report and provide the log steps which will come in report
	    logger.log(Status.INFO, "Login to amazon");
	   
	    logger.log(Status.PASS, "logger Title verified");
	    logger.log(Status.FAIL, "logger Title verified");
	   
            // Flush method will write the test in report- This is mandatory step  
	    extent.flush();
		
            // You can call createTest method multiple times depends on your requirement
            // In our case we are calling twice which will add 2 testcases in our report
	    ExtentTest logger2=extent.createTest("Logoff Test");
	    
	    logger2.log(Status.PASS, "logger2 Title verified/Pass");
	    logger2.log(Status.FAIL, "logger2 Title verified/Fail");
	    
	    logger2.pass("logger2 Pass because of some issues", MediaEntityBuilder.createScreenCaptureFromPath("/Users/mukeshotwani/Desktop/logo.jpg").build());
        
	    logger2.fail("logger2 Failed because of some issues", MediaEntityBuilder.createScreenCaptureFromPath("/Users/mukeshotwani/Desktop/logo.jpg").build());

            // This will add another test in report
	    extent.flush();
	    	
	}
	
}