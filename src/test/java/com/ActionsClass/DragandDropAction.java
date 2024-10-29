package com.ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragandDropAction {
  @Test
  public void testDragandDrop() throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://jqueryui.com/droppable/#default");
	  driver.manage().window().maximize();
	  
	  //frame handle
	  driver.switchTo().frame(0);
	  
	  Thread.sleep(2000);
	  //src ele
	  WebElement srcEle=driver.findElement(By.id("draggable"));
	  
	  //target ele
	  WebElement targetEle=driver.findElement(By.id("droppable"));	  
	  
	  //Actions
	  
	  Actions act=new Actions(driver);
	  try {
	  act.dragAndDrop(srcEle,targetEle).perform();
	  
	  }catch(StaleElementReferenceException s)
	  {
		  System.out.println("Element is not visible in Dom");
	  }
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
