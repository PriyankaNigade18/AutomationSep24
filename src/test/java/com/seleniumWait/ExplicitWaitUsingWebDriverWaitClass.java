package com.seleniumWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class ExplicitWaitUsingWebDriverWaitClass {
  @Test
  public void testWait()
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	  
	  By startbtn=By.xpath("//button[text()='Start']");
	  By textele=By.xpath("(//h4)[2]");
	 
	  
	  driver.findElement(startbtn).click();
	  
	  String text=Utility.waitForElementVisibility(driver,textele).getText();
//	  String text=driver.findElement(textele).getText();
	  System.out.println(text);
//	  
	  
	  
  }
}
