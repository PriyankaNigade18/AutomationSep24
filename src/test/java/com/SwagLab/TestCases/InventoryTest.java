package com.SwagLab.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InventoryTest extends BaseClass 
{
	@BeforeClass
	public void pageSetup()
	{
		ip=lp.doLogin(prop.getData("un"),prop.getData("psw"));
	}
	
	
	
  @Test(priority=1)
  public void validateTotalProducts()
  {
	  int actCount=ip.getProductCount();
	  AssertJUnit.assertEquals(actCount,6);
	  System.out.println("Product count matched!:Total products are: "+actCount);
	  
  }
  
  @Test(priority=2)
  public void validateProductsDetails()
  {
	  
	  ip.getProductDetails();
	  
  }
  
  
  @Test(priority=3)
  public void validateAddTocartFeature()
  {
	  ip.addProductToCart(prop.getData("pname"));
  }
  
  @Test(priority=4)
  public void validateLaunchingOfCartPage()
  {
	  ip.openCartPage();
  }
}
