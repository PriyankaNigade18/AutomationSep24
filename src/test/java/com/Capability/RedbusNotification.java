package com.Capability;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class RedbusNotification {
  @Test
  public void testApp() 
  {
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("--disable-notifications");
	  
	  
	  WebDriver driver=new ChromeDriver(options);
	  driver.get("https://www.redbus.in");
  }
}
