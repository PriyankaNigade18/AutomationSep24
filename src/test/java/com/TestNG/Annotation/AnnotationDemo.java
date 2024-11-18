package com.TestNG.Annotation;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class AnnotationDemo
{
  @Test
  public void testcase1()
  {
	  System.out.println("Test Case 1 is executing!");
  }
  
  
  @Test
  public void testcase2()
  {
	  System.out.println("Test Case 2 is executing!");
  }
  
  
  @Test
  public void testcase3()
  {
	  System.out.println("Test Case 3 is executing!");
  }
  //Annotation-Rules
  
  @BeforeMethod
  public void bmethod()
  {
	 System.out.println("Before Method will run before every test case!"); 
  }
  
  @AfterMethod
  public void amethod()
  {
	  System.out.println("After Method will run after every test case");
	  
  }
  
  @BeforeClass
  public void bclass()
  {
	  System.out.println("Before class will run before fisrt test case!");
  }
  
  @AfterClass
  public void aClass()
  {
	  System.out.println("After class will run after last test case !");
  }
}
