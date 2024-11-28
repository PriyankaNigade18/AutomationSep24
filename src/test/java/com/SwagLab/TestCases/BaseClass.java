package com.SwagLab.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.SwagLab.Pages.*;
import com.SwagLab.Utility.PropertiesUtil;



public class BaseClass
{

	public WebDriver driver;
	public PropertiesUtil prop;
	public LoginPage lp;
	public InventoryPage ip;
	public CartPage cp;
	
	@BeforeTest
	public void setUp()
	{
		prop=new PropertiesUtil();
		driver=new ChromeDriver();
		driver.get(prop.getData("url"));
		lp=new LoginPage(driver);
		ip=new InventoryPage(driver);
		cp=new CartPage(driver);
		
		
		
	}
	
	public void addWait()
	{
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
//	@AfterTest
//	public void teardown()
//	{
//		driver.quit();
//	}
}
