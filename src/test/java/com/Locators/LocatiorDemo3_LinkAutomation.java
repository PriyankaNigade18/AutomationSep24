package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatiorDemo3_LinkAutomation {

	public static void main(String[] args) {
		// Create a driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://automationplayground.com/crm/");
		
		//sign in 
		//driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.partialLinkText("Sign")).click();

	}

}
