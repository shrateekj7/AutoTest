package TestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	//this method will be called when test case gets failed 
	public void onTestFailure(ITestResult Result)
	{
	System.out.println("the name of the testcase failed is : "+ Result.getName());	
	}
	
	//this method will be called when test case will get skipped
	public void onTestSkipped(ITestResult Result)
	{
	System.out.println("the name of the testcase skipped is : "+ Result.getName());	
	}
	
	//this method will be called when test case get started
		public void onTestStart(ITestResult Result)
		{
		System.out.println("the name of the testcase started is : "+ Result.getName());	
		}
		
		
	//this method will be called when test case gets passed 
	public void onTestSuccess(ITestResult Result)
	{
	System.out.println("the name of the testcase passed is : "+ Result.getName());	
	}
}
