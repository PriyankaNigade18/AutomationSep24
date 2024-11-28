package com.SwagLab.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CartTest extends BaseClass
{
	@BeforeClass
	public void pageSetup()
	{
		ip=lp.doLogin(prop.getData("un"),prop.getData("psw"));
		addWait();
		ip.addProductToCart(prop.getData("pname"));
		addWait();
		ip.openCartPage();
		addWait();
	}
	
	
  @Test(priority=1)
  public void validateProductRemove()
  {
	  cp.removeProduct();
  }
  
  
  @Test(priority=2)
  public void validateContinueShopping()
  {
	 ip= cp.continueShopping();
	 addWait();
	 ip.addProductToCart(prop.getData("pname2"));
	 addWait();
	 ip.openCartPage();
	 addWait();
	  
  }
  
  @Test(priority=3)
  public void validateLaunchingOfCheckOutPage()
  {
	  cp.launchCheckoutPage();
  }
}
