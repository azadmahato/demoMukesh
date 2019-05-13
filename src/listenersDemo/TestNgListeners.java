package listenersDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test starts and details are :"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test success and details are :"+result.getName());	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test fails and details are :"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext result) {
		
	}

	@Override
	public void onFinish(ITestContext result) {
		System.out.println("test finish and details are :"+result.getName());
	}

}
