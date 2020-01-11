package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		System.out.println("****Test Started: "+result.getName());
		
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("****Test Success: "+result.getName());
		
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("****Test Fail: "+result.getName());
		
	}
	public void onTestSkip(ITestResult result) {
		System.out.println("****Test Skip: "+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}




}
