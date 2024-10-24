package com.webTesting.WebElementScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameHandling {
  @Test
  public void frameTest()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://ui.vision/demo/webtest/frames/");
	  
	  //frame with index
	  //driver.switchTo().frame(0);
	  
	  
	  //frame with webelement
	  WebElement frameEle=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	  driver.switchTo().frame(frameEle);
	  driver.findElement(By.name("mytext1")).sendKeys("Type in Frame1");
	  
	  
	  //main document
	 driver.switchTo().defaultContent();
	  
	  //frame2
	  WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
	  driver.switchTo().frame(frame2);
	  driver.findElement(By.name("mytext2")).sendKeys("Type in Frame2");
	  
	  //main document
		 driver.switchTo().defaultContent();
		 
		 WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		 driver.switchTo().frame(frame3);
		 
		 driver.findElement(By.name("mytext3")).sendKeys("Type in Frame3");

	  //inner frame
		 
	  
	  
	  
	  
  }
}
