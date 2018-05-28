package testng_liestners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Failed_testcases implements IRetryAnalyzer{
	
	int retrycount=0;
	int maxretry=4;

	@Override
	public boolean retry(ITestResult result) {
		
		if(ITestResult.FAILURE==result.getStatus()&&retrycount<=maxretry) {
			
			System.out.println("invocation count is : "+retrycount);
			
			return true;
			
		}
		return false;
	}

	
	
}
