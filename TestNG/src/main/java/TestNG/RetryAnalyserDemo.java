package TestNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyserDemo implements IRetryAnalyzer {

	int counter=0;
	int retryCount=4;
	
	public boolean retry(ITestResult Result) {
		if(counter < retryCount) {
			counter ++;
			return true;
		}
		return false;
	}
}
