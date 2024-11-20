package com.TestNG.PageObjectUsingPageFactory;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewLoginPageTest extends NewBaseClass
{
  @Test(priority=1)
  public void validateUrl()
  {
	  String actUrl=lp.getAppurl();
	  String expUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	  Assert.assertEquals(actUrl,expUrl,"Url is not matching!");
	  System.out.println("Url is matching!");
	  
  }
  
  @Test(priority=2)
  public void validateLogin()
  {
	  lp.doLogin("Admin","admin123");
	  Assert.assertTrue(lp.getAppurl().contains("dashboard"),"Login Fail");
	  System.out.println("Login success");
  }
}
