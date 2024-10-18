package com.webTesting.WebElementScenarios;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertHandling {
  @Test
  public void testAlert() throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	  
	  //alert1
	  driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	  
	  Thread.sleep(2000);
	  //alert will open-UnhandledAlertException 
	  Alert alt1=driver.switchTo().alert();
	  System.out.println("Alert text is: "+alt1.getText());
	  alt1.accept();
	  
	  //result
	  WebElement resultele=driver.findElement(By.id("result"));
	  System.out.println("Result of first alert: "+resultele.getText());
	  
	  //driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	  
	  
	  
	  
	  
  }
}
