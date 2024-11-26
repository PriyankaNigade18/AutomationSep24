package com.DataDrivenTesting;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ScreenshotTest {
  @Test
  public void testScrenshot() throws IOException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com"); 
	  
  TakesScreenshot ts=(TakesScreenshot) driver;
  File temp=ts.getScreenshotAs(OutputType.FILE);
  File dest=new File(System.getProperty("user.dir")+"//Screenshots//pic.png");
  
  FileHandler.copy(temp,dest);
  
  
  
  
  
  
  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  
  
  
  }
}
