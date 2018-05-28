package testng_liestners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Itestng_Liestners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("the test case is started"+"    "+result.getTestName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("the test case is success"+"    "+result.getTestName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("the test case is failur"+"    "+result.getTestName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("the test case is skipped"+"    "+result.getTestName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getTestName());
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
