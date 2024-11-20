package com.TestNG.PageObjectUsingPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewPageClass 
{
	private WebDriver driver;
	
	public NewPageClass(WebDriver driver)//baseclass
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	//locator
	@FindBy(name="username")
	WebElement usern;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbtn;
	
	
	
	public void doLogin(String un,String psw)
	{
		usern.sendKeys(un);
		pass.sendKeys(psw);
		loginbtn.click();
	}
	
	
	public String getAppurl()
	{
		return driver.getCurrentUrl();
	}
	
	
	
	
	
}
