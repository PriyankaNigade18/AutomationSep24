package com.webTesting.WebElementScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCalendar_RedBus {
  @Test
  public void testCalendar()
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.redbus.in/");
	  
	  //open that calndar
	  driver.findElement(By.xpath("//span[@class='dateText']")).click();
	  
	  //Expection
	  String date="27";
	  String month="Apr";
	  String year="2025";
	  
	  //select month
	  while(true)
	  {
	  String text=driver.findElement(By.xpath("(//div[contains(@class,'DayNavigator')])[3]")).getText();
	  System.out.println(text);
	  String cmonth=text.split(" ")[0];
	  String cyear=text.split(" ")[1];
	  
	  System.out.println("Current month: "+cmonth);
	  System.out.println("Current year: "+cyear);
	  
	  if(cmonth.contains(month) && cyear.contains(year))
	  {
		 break; 
	  }else
	  {
		  //click on arrow
		  driver.findElement(By.xpath("(//div[contains(@class,'DayNavigator')])[4]")).click();
	  }
	  
	  
	  }
	  	   
	  //select date
	  
	  List<WebElement> allDates=driver.findElements(By.xpath("//div[contains(@class,'DayTilesWrapper')]//div[contains(@class,'DayTiles')]"));
	  
	  
	  for(WebElement i:allDates)
	  {
		  if(i.getText().contains(date))
		  {
			  i.click();
			  break;
		  }
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
