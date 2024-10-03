package com.Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo5_tagName {

	public static void main(String[] args) 
	{
		// Create a driver session
			WebDriver driver=new ChromeDriver();
			//implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://opensource-demo.orangehrmlive.com/auth/login");
				
			//number of textrboxes
			List<WebElement> allBoxes= driver.findElements(By.tagName("input"));
			System.out.println("Total Input boxes: "+allBoxes.size());
			
			//number of images
			List<WebElement> allImages= driver.findElements(By.tagName("img"));
			System.out.println("Total Images boxes: "+allImages.size());
			
			//number of links
			List<WebElement> allLink= driver.findElements(By.tagName("a"));
			System.out.println("Total Links boxes: "+allLink.size());
			
			

	}

}
