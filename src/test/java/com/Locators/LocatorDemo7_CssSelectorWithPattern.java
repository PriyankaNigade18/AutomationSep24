package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo7_CssSelectorWithPattern {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		
		//tagname with *- contains()
		driver.findElement(By.cssSelector(" input[placeholder *='User']")).sendKeys("Priyanka");
		
		Thread.sleep(2000);
		
		//tagname with ^ starts with()
		driver.findElement(By.cssSelector("input[placeholder ^='Us']")).clear();
		
		Thread.sleep(2000);
		//tagname with $ endsWith()
		driver.findElement(By.cssSelector("input[placeholder $='me']")).sendKeys("Jay");
		
	}

}
