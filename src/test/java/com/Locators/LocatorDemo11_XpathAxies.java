package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo11_XpathAxies {

	public static void main(String[] args) {
		// Create a driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		
		//search box--->Electronics
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']//following::a[normalize-space()='Electronics']")).click();
		
		
		//update location
		String text=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']//preceding::span[normalize-space()='Update location']")).getText();
		
		System.out.println(text);
	
	
	}

}
