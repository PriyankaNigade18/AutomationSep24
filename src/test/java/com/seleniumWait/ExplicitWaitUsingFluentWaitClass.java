package com.seleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class ExplicitWaitUsingFluentWaitClass {
  @Test
  public void f() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	  
	  By startbtn=By.xpath("//button[text()='Start']");
	  By textele=By.xpath("(//h4)[2]");
	 
	  
	  driver.findElement(startbtn).click();
	  
	  Wait<WebDriver> wait1 =
		        new FluentWait<WebDriver>(driver)
		            .withTimeout(Duration.ofSeconds(5))
		            .pollingEvery(Duration.ofMillis(300))
		            .ignoring(ElementNotInteractableException.class);
	  
	  String text=wait1.until(ExpectedConditions.visibilityOfElementLocated(textele)).getText();
	  
	  System.out.println(text);
	  
  }
}
