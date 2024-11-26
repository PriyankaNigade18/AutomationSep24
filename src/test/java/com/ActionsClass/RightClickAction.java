package com.ActionsClass;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class RightClickAction {
  @Test
  public void testAction() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	  
	  Utility.takeScreenshot(driver,"Guru99HomePage");
	  //element
	  WebElement ele=driver.findElement(By.xpath("//span[text()='right click me']"));
	  
	  
	  //actions class object
	  Actions act=new Actions(driver);
	  
	  act.contextClick(ele).build().perform();
	  
	  Utility.takeScreenshot(driver,"RightclickAction");
	  List<WebElement> list=driver.findElements(By.xpath("(//ul)[3]//li//span"));
	  
	  for(WebElement i:list)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("Delete"))
		  {
			  i.click();
			  break;
		  }
	  }
	  
	  Thread.sleep(2000);
	  
	  //alert handle
	  Alert alt=driver.switchTo().alert();
	  System.out.println("Alert text is: "+alt.getText());
	  alt.accept();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
