package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo 
{
  @Test
  public void hardAssertTest() 
  {
	  String act="Selenium WebDriver is WebUI automation library";
	  String exp="Selenium WebDriver is WebUI automation library/tool";
	  /*
	  //assertion-java.lang.AssertionError
	  Assert.assertEquals(act,exp,"Assertion Fail!...Test Fail!");
	  
	  System.out.println("Assertion pass!...Test Pass!");
	 */ 
	  
//	  Assert.assertTrue(act.contains("WebUI"),"Assertion Fail!...Test Fail!");
//	  System.out.println("Assertion pass!...Test Pass!");
	  
	  //actual string should not contains TestNG
	  
	  Assert.assertFalse(act.contains("TestNG"),"Test Fail: AS TestNG is part of actual string");
	  System.out.println("Test Pass: AS TestNG is not a part of Actual string");
	  
	  }
  
  
  @Test
  public void softAssertionTest()
  {
	  
	  int a=100,b=200;
	  SoftAssert sf=new SoftAssert();
	  sf.assertEquals(a,b,"Test Fail: As numbers are not equal");
	  System.out.println("Test Pass: As numbers are equal");
	  
	  sf.assertAll();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
