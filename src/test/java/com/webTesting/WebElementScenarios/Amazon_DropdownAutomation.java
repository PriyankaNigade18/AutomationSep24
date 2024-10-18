package com.webTesting.WebElementScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class Amazon_DropdownAutomation
{
  @Test
  public void testCase1() throws InterruptedException
  {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	
	//identify address of dropdown
	WebElement dropdownele=driver.findElement(By.name("url"));
	Utility.selectBasedDropdown(dropdownele,"Books");
	
	/*
	//create object of Select class
	Select sc=new Select(dropdownele);
	
	System.out.println("Is dropdown supported for multiple selection?: "+sc.isMultiple());
	
	//single selection
	sc.selectByIndex(3);
	Thread.sleep(2000);
	sc.selectByValue("search-alias=mobile-apps");
	Thread.sleep(2000);
	sc.selectByVisibleText("Books");
	
	//get all options
	List<WebElement> allOptions=sc.getOptions();
	System.out.println("Total options are: "+allOptions.size());
	
	
	for(WebElement i:allOptions)
	{
		System.out.println(i.getText());
		if(i.getText().contains("Video Games"))
		{
			i.click();
			break;
		}
	}
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
  }
}
