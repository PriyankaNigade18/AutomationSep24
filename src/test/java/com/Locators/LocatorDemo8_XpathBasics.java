package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo8_XpathBasics {

	public static void main(String[] args)
	{

		//create a driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		
		//email 
		driver.findElement(By.xpath("//input[@placeholder='E-Mail Address']")).sendKeys("sumit11@gmail.com");
		
		//pass
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test123");
		
		//button
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		

	}

}
