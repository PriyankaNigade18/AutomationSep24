package com.testReports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportDemo {
  @Test
  public void testReport()
  {
	  //create object of ExtentReports
	  
	  ExtentReports extent=new ExtentReports();
	  
	  //path of report
	  ExtentSparkReporter spark=new ExtentSparkReporter(System.getProperty("user.dir")+"//Reports//AutomationTest.html");
	  
	  //configuration
	  spark.config().setDocumentTitle("Test Report");
	  spark.config().setReportName("Sprint 1 report");
	  spark.config().setTheme(Theme.DARK);
	  
	  
	  //attached the report
	  extent.attachReporter(spark);
	  
	  //create test- log
	 ExtentTest test= extent.createTest("SampleTestCases");
	 
	 test.log(Status.PASS,"Test Case pass");
	 test.log(Status.FAIL, "Test Case Fail");
	 test.log(Status.INFO,"Failure info");
	 test.log(Status.SKIP, "Test Case Skip");
	 
	 
	 //close the report- flush()
	 extent.flush();
	 		
	 
	 
	 
	 
	 
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
