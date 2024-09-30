package com.webTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException
	{
		// Create a driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		//navigate to facebook from google
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(2000);

		//back()
		driver.navigate().back();//google
		
		Thread.sleep(2000);
		
		//forward()
		driver.navigate().forward();//facebook
		
		Thread.sleep(2000);
		
		//refresh()
		driver.navigate().refresh();//page refresh
		
		
		
		
		
	}

}
