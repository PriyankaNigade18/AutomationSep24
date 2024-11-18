package com.TestNG.Annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass
{
	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		 driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
	}
	
	@BeforeMethod
	  public void getPageTitle()
	  {
		  System.out.println("Page Title is: "+driver.getTitle());
	  }
	  
	  @AfterMethod
	  public void getPageUrl()
	  {
		  System.out.println("Page url is: "+driver.getCurrentUrl());
	  }
	  
	  @AfterClass
	  public void tearDown()
	  {
		  driver.quit();
	  }

}
