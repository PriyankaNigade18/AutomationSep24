package com.TestNG.Annotation;

import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassB {
	@Test
	  public void testCase3() 
	  {
		  System.out.println("Class B testcase3");
		  
	  }
	
	@Test
	  public void testCase4() 
	  {
		  System.out.println("Class B testcase4");
		  
	  }
	
	@BeforeTest
	public void btest()
	{
		System.out.println("Before Test will run before first class ");
	}
	
	@AfterTest
	public void atest()
	{
		System.out.println("After Test will run after last class ");
	}
	
	@BeforeSuite
	public void bsuite()
	{
		System.out.println("Before suite will run before test");
	}
	@AfterSuite
	public void asuite()
	{
		System.out.println("After suite will run after test");
	}
}
