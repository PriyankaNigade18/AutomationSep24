package com.Capability;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HeadlessModeTesting {
  @Test
  public void testGoogleSearch() 
  {
	  
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("--headless");
	  
	  WebDriver driver=new ChromeDriver(options);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.google.com");
	  
	  //search
	  driver.findElement(By.name("q")).sendKeys("testng");
	  
	  List<WebElement> allOptions=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
	  
	  System.out.println("Total Element: "+allOptions.size());
	  
	  for(WebElement i:allOptions)
	  {
		  System.out.println(i.getText());
	  }
	  
	  
	  
  }
}
