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
	
	@BeforeTest
	public void setUp()
	{
		prop=new PropertiesUtil();
		driver=new ChromeDriver();
		driver.get(prop.getData("url"));
		lp=new LoginPage(driver);
		
		
		
	}
	
	
}
