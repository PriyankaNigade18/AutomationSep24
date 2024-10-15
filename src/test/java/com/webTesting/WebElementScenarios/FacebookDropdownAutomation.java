package com.webTesting.WebElementScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropdownAutomation 
{

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
	
	
	
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
		
		//create an account
		driver.findElement(By.linkText("Create new account")).click();
		
		//day dropdown
		WebElement dayele=driver.findElement(By.id("day"));
		selectBasedDropdown(dayele,"27");
		
		//month 
		WebElement monthele=driver.findElement(By.id("month"));
		selectBasedDropdown(monthele,"Jul");
		
		//year
		WebElement yearele=driver.findElement(By.id("year"));
		selectBasedDropdown(yearele,"2010");
		
		
		
//		Select s1=new Select(dayele);
//		System.out.println("Is dropdown support multiple selection?: "+s1.isMultiple());
//		
//		
//		List<WebElement> allOptions=s1.getOptions();
//		System.out.println("Total options are: "+allOptions.size());
//		
//		for(WebElement i:allOptions)
//		{
//			System.out.println(i.getText());
//			if(i.getText().contains("29"))
//			{
//				i.click();
//				break;
//			}
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
