package com.TestNG.Annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class RealTimeUseOfAnnotation extends BaseClass
{
//	WebDriver driver;
//	@BeforeClass
//	public void setup()
//	{
//		 driver=new ChromeDriver();
//		driver.get("https://automationplayground.com/crm/");
//	}
	
	
  @Test(priority=1)
  public void validateSignIn()
  {
	  WebElement ele=driver.findElement(By.linkText("Sign In"));
	  if(ele.isDisplayed() && ele.isEnabled())
	  {
		  ele.click();
		  
	  }
	  
  }
  
  @Test(priority=2)
  public void validateLogin()
  {
	driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
	driver.findElement(By.id("password")).sendKeys("test123");
	driver.findElement(By.id("submit-id")).click();
  }
  
  
  
//  @BeforeMethod
//  public void getPageTitle()
//  {
//	  System.out.println("Page Title is: "+driver.getTitle());
//  }
//  
//  @AfterMethod
//  public void getPageUrl()
//  {
//	  System.out.println("Page url is: "+driver.getCurrentUrl());
//  }
//  
//  @AfterClass
//  public void tearDown()
//  {
//	  driver.quit();
//  }
}
