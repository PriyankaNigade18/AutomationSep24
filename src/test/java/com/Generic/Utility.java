package com.Generic;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility {

	
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
