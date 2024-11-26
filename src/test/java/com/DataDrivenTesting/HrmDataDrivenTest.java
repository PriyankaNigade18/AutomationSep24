package com.DataDrivenTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HrmDataDrivenTest 
{
	//@Test(dataProvider ="arraydata",dataProviderClass = CustomData.class)
	@Test(dataProvider ="exceldata",dataProviderClass = CustomData.class)
  public void login(String un,String psw) 
  {
	  WebDriver driver=new ChromeDriver();
	  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  	driver.findElement(By.name("username")).sendKeys(un);
	  	driver.findElement(By.name("password")).sendKeys(psw);
	  	driver.findElement(By.xpath("//button[@type='submit']")).click();
	  	
	  	Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
	  	System.out.println("Login successfull!");
	  	
	  	
	  	
  }
}
