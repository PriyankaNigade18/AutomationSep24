package com.TestNG.DataPassing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Generic.PropertiesUtil;

public class HrmDataReadFRomPropertiesFile {
  @Test
  public void loginTest()
  {
	  PropertiesUtil p1=new PropertiesUtil();
	  WebDriver driver=new ChromeDriver();
	  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  	driver.get(p1.getData("url"));
	  
	  	driver.findElement(By.name("username")).sendKeys(p1.getData("un"));
	  	driver.findElement(By.name("password")).sendKeys(p1.getData("psw"));
	  	driver.findElement(By.xpath("//button[@type='submit']")).click();
	  	
	  	
	  
  }
}
