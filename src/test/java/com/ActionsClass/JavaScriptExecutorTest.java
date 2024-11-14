package com.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class JavaScriptExecutorTest {
  @Test
  public void testScroll() throws InterruptedException 
  {
	  /*
	   * scrollTo()
	   * refresh()
	   * title
	   * element click()
	   */
	  
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in");
	  
	  
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  
	  //refresh the page
	  js.executeScript("history.go(0)");
	  
	  
	  //get the title
	 String title= js.executeScript("return document.title").toString();
	  System.out.println(title);
	  
	  
	  //element click
	  WebElement ele=driver.findElement(By.xpath("//span[normalize-space()='Cart']"));
	  
	  js.executeScript("arguments[0].click();",ele);
	  
	  
	  
	  
	  
//	  Utility.scrollDown(driver);
//	
//	  Thread.sleep(3000);
//	  
//	  Utility.scrollUp(driver);
//	  
//	  Thread.sleep(3000);
//	  
//	  WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'Best Sellers in Clothing')]"));
//	  Utility.scrollUpToElement(driver,ele);
//	  
	  
	  
	  
	 
	  
	  
	  
	  
	  
	  
	  /*
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  
	 // js.executeScript("window.scrollTo(0,5000)");
	  
	  //scroll down
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  
	  Thread.sleep(3000);
	  
	  //scroll up
	  js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	  
	  Thread.sleep(3000);
	  
	  //upto Element- scrollIntoView()
	  WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'Best Sellers in Clothing')]"));
	  
	  js.executeScript("arguments[0].scrollIntoView(true);",ele);
	  
	  System.out.println("Scroll upto element!");
	  */
	  
	  
	  
	  
	  
	  
  }
}
