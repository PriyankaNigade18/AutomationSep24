package com.Generic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {

	
	
	
	//explicit wait
	public static WebElement waitForElementPresence(WebDriver driver,By loc)
	{
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
		return wait1.until(ExpectedConditions.presenceOfElementLocated(loc));
	}
	
	
	public static WebElement waitForElementVisibility(WebDriver driver,By loc)
	{
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
		return wait1.until(ExpectedConditions.visibilityOfElementLocated(loc));
	}
	
	
	public static WebElement waitForElementClickable(WebDriver driver,By loc)
	{
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
		return wait1.until(ExpectedConditions.elementToBeClickable(loc));
	}
	public static void selectBasedDropdown(WebElement ele,String value)
	{
		Select s1=new Select(ele);
		System.out.println("Is dropdown support multiple selection?: "+s1.isMultiple());
		
		List<WebElement> allOptions=s1.getOptions();
		System.out.println("Total options are: "+allOptions.size());
		
		for(WebElement i:allOptions)
		{
			System.out.println(i.getText());
			if(i.getText().contains(value))
			{
				i.click();
				break;
			}
		}
	}
	
	
}
