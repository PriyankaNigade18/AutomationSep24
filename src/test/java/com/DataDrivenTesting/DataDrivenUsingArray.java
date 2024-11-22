package com.DataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenUsingArray 
{
	@DataProvider(name="arraydata")
	public Object[][] testData()
	{
		Object data[][]= {{"Admin","admin123"},{"Kiran","test123"},{"Admin","admin123"},{"Ram","test123"}};
		return data;
	}
	
  @Test(dataProvider = "arraydata")
  public void loginTest(String un,String psw) 
  {
	  System.out.println("User name is: "+un);
	  System.out.println("Password is: "+psw);
  }
}
