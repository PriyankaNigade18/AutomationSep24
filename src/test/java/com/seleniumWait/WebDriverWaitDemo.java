package com.seleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WebDriverWaitDemo {
  @Test
  public void testExplicitWait() 
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	  
	  By email=By.id("input-email");
	  By password=By.name("password");
	  By btn=By.xpath("//input[@value='Login']");
	  
	  /*
	   * TimeoutException: Expected condition failed: 
	   * waiting for presence of element located by: 
	   * By.id: input-email### (tried for 5 second(s)
	   *  with 500 milliseconds interval)
	   *  
	   *  interval time =polling time
	   *  by default selenium polling time is 0.5 sec / 500ms
	   *  
	   */
	  
	  WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
	  WebElement ele1=wait1.until(ExpectedConditions.presenceOfElementLocated(email));
	  ele1.sendKeys("test@gmail.com");
	  
	  WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(5));
	  wait2.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys("test123");
	  
	  WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(5));
	  wait3.until(ExpectedConditions.elementToBeClickable(btn)).click();
	  
	  
	  
	  
	  
	  
  }
}
