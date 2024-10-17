package com.webTesting.WebElementScenarios;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindowHandling {
  @Test
  public void testWindow() 
  {
	  WebDriver driver=new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  //home page
	  
	  String parentId=driver.getWindowHandle();
	  System.out.println(parentId);
	  
	  
	  //link
	  driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	  //child page
	  
	  Set<String> allWindows=driver.getWindowHandles();
	  System.out.println(allWindows);
	  
	  for(String childId:allWindows)
	  {
		  if(!parentId.equals(childId))//if parent id is not equal to child id
		  {//child window
			  driver.switchTo().window(childId);
			  System.out.println(driver.getWindowHandle());
			//email
			 driver.findElement(By.name("EmailHomePage")).sendKeys("test@gmail.com");
			  //driver.close();//current window it will close
			 //driver.quit();//all windows will close
			 
		  }
	  }
	  
	  
	  //parent window
	  driver.switchTo().window(parentId);
	  
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
