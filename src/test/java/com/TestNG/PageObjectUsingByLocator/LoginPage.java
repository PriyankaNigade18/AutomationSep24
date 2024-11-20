package com.TestNG.PageObjectUsingByLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
	WebDriver driver;
	
	//initialize driver
	public LoginPage(WebDriver driver)//base class
	{
		this.driver=driver;
	}
	
	//locator
	By usern=By.name("username");
	By pass=By.name("password");
	By loginBtn=By.xpath("//button[@type='submit']");
	
	//Methods/Actions
	public void enterUserName(String un)
	{
		driver.findElement(usern).sendKeys(un);
	}
	
	public void doLogin(String un,String psw)
	{
		driver.findElement(usern).sendKeys(un);
		driver.findElement(pass).sendKeys(psw);
		driver.findElement(loginBtn).click();
	}
	
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
