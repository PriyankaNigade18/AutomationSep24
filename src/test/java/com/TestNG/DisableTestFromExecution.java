package com.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class DisableTestFromExecution
{
	@Test(priority=1,description="This is functional test")
	  public void registerTest() 
	  {
		  System.out.println("User will register first");
	  }
	  
	  @Test(priority=2)
	  public void loginTest() 
	  {
		  System.out.println("User will login");
	  }
	  
	  
	  @Test(priority=3)
	  public void searchProductTest() 
	  {
		  System.out.println("User will search a product");
	  }
	  
	  @Test(priority=4,enabled=false)
	  public void addTocartTest() 
	  {
		  System.out.println("User will add product to cart");
	  }
	  
}
