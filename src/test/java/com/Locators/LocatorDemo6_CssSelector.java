package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo6_CssSelector {

	public static void main(String[] args) 
	{
		//create a driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		
		//username-tagname with id
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		
		//password- tagname with attribute
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("secret_sauce");
		
		//login-tagname with classname
		
		//driver.findElement(By.cssSelector("input.btn_action")).click();
		
		//tagname with id,class,attribute
		driver.findElement(By.cssSelector("input#login-button.btn_action[value='LOGIN']")).click();
		
		

	}

}
