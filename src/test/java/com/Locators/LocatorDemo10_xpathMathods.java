package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo10_xpathMathods {

	public static void main(String[] args) 
	{
		// Create a driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		
		//mobiles page- text()
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		
		//click on Cart
		driver.findElement(By.xpath("//span[normalize-space()='Cart']")).click();
		
		//msg
		String text1=driver.findElement(By.xpath("//h3[normalize-space()='Your Amazon Cart is empty']")).getText();
		System.out.println(text1);
		
		//search box-contains
		driver.findElement(By.xpath("//input[contains(@id,'tabsearchtex')]")).sendKeys("watch",Keys.ENTER);
		
		//search box- startswith(prefix)
		WebElement ele=driver.findElement(By.xpath("//input[starts-with(@id,'twotab')]"));
		ele.clear();
		ele.sendKeys("bags",Keys.ENTER);
		
		

	}

}
