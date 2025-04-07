package utilities;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenerclass implements ITestListener
{
	public void onTestFailure(ITestResult result)
	{
		System.out.println("The name of the test case failled is :"+result.getName());
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("The name of the test case Skipped is :"+result.getName());
	}
	
	public void onTestStart(ITestResult result)
	{
		System.out.println(result.getName()+" test case started");
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("The name of the test case passed is :"+result.getName());
	}

}
