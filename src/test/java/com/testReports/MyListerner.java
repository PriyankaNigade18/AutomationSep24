package com.testReports;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListerner implements ITestListener
{
	
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test Started..."+result.getName());
	}
	
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test Case pass: "+result.getName());
	}
	
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test Case Fail: "+result.getName());

	}
	
	

}
