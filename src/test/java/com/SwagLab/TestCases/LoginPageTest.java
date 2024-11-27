package com.SwagLab.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass 
{
  @Test(priority=1)
  public void validateUrl() 
  {
	  String actUrl=lp.getAppUrl();
	  Assert.assertTrue(actUrl.contains("saucedemo"));
	  System.out.println("Test Pass ....Url matched!: "+actUrl);
	  
  }
  
  @Test(priority=2)
  public void validateTitle()
  {
	  String actTitle=lp.getAppTitle();
	  Assert.assertEquals(actTitle,"Swag Labs");
	  System.out.println("Test Pass.....Title matched: "+actTitle);
	  
  }
  
  @Test(priority=3)
  public void validateLogin()
  {
	  lp.doLogin(prop.getData("un"),prop.getData("psw"));
	  Assert.assertTrue(lp.getAppUrl().contains("inventory"));
	  System.out.println("Login Successfull!");
  }
}
