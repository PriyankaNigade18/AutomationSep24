package com.webTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args)
	{
		//create a driver session
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
		
		//get the title
		System.out.println("Title is: "+driver.getTitle());
		
		//to get current url
		System.out.println("Current url is: "+driver.getCurrentUrl());
		
		//to get the page source
		System.out.println(driver.getPageSource());
		
		
		//close the browser close() quit()
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
