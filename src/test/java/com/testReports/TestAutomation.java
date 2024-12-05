package com.testReports;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners(com.testReports.MyListerner.class)
public class TestAutomation {
  @Test(priority=1)
  public void RegisterTest()
  {
	 System.out.println("User registartaion process test"); 
	 AssertJUnit.assertEquals(true,true);
  }
  
  
  
  @Test(priority=2)
  public void LoginTest()
  {
		 System.out.println("User login process test");
		 AssertJUnit.assertEquals(true,false);

	  
  }
}
