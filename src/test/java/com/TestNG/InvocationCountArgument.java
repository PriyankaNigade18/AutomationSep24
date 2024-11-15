package com.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class InvocationCountArgument {
  @Test
  public void testCase1() 
  {
	  System.out.println("Test Case 1 is running!");
  }
  
  @Test(invocationCount=3)
  public void testCase2() 
  {
	  System.out.println("Test Case 2 is running!");
  }
  
  @Test
  public void testCase3() 
  {
	  System.out.println("Test Case 3 is running!");
  }
}
