package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo9_Operator_Indexing {

	public static void main(String[] args)
	{
		//create  driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		//firstname-- and operator
		driver.findElement(By.xpath("//input[@name='firstname' and @class='form-control']")).sendKeys("Shital");
		
		//lastname -- or operator
		driver.findElement(By.xpath("//input[@placeholder='Last Name' or @name='lastname']")).sendKeys("sharma");
		
		//email ----indexing
		driver.findElement(By.xpath("(//input[@class='form-control'])[3]")).sendKeys("shital@gmail.com");
		
		//telephone ----indexing
		driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("776689999");
			
		//password --position()
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=5]")).sendKeys("test123");
		
		//confirm pass --position()
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=6]")).sendKeys("test123");
		
		//radio button
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		
		//checkbox
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		
		//button
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
