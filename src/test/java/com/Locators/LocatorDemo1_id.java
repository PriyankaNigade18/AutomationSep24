package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo1_id {

	public static void main(String[] args)
	{
		// Create a driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		
		//technique3: Identify + Action
		driver.findElement(By.id("APjFqb")).sendKeys("TestNg");
		
		
		/*
		//technique2: Identify + validation +action
		WebElement ele=driver.findElement(By.id("APjFqb"));
		
		//validation
		if(ele.isDisplayed() && ele.isEnabled())
		{
			//action
			ele.sendKeys("selenium");
			
		}
		
		*/
		/*
		//technique1: By Locator + validation + Action
		
		//search box address
		By searchbox=By.id("APjFqb");
		
		//identify this element
		WebElement ele=driver.findElement(searchbox);
		
		//validation 
		System.out.println("Is Searchbox is displayed on the page?: "+ele.isDisplayed());
		System.out.println("Is searchbox is enabled?: "+ele.isEnabled());
		
		
		//action
		ele.sendKeys("Java",Keys.ENTER);
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
