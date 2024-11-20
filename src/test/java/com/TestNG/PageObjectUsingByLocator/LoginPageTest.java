package com.TestNG.PageObjectUsingByLocator;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass
{
	
	
  @Test(priority=1)
  public void validateUrl() 
  {
	  LoginPage lp=new LoginPage(driver);
	  String actUrl=lp.getAppUrl();
	  Assert.assertTrue(actUrl.contains("opensource"),"Url is not matching!");
	  System.out.println("Url is matching!");
  }
  
  @Test(priority=2)
  public void validateTitle() 
  { 
	  LoginPage lp=new LoginPage(driver);
	  String actTitle=lp.getAppTitle();
	  Assert.assertTrue(actTitle.contains("HRM"),"Title is not matching!");
	  System.out.println("Title is matching!");
  }
  
  
  @Parameters({"un"})
  @Test(priority=3)
  public void validateLogin(String un) 
  { LoginPage lp=new LoginPage(driver);
	  
	  lp.doLogin(un,"admin123");
	  Assert.assertTrue(lp.getAppUrl().contains("dashboard"),"Login Fail");
	  System.out.println("Login Success");
  }
}
