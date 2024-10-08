package com.webTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitleValidation {

	public static void main(String[] args)
	{
		//Create a driver session
		WebDriver driver=new ChromeDriver();
		
		//open application
		driver.get("https://www.google.com");
		
		//get the title
		String actTitle=driver.getTitle();
		
		
		System.out.println(actTitle);
		System.out.println(driver.getTitle());
		
		
		
		/*
		//compare with expected
		String expTitle="Google";
		if(actTitle.equals(expTitle))
		{
			System.out.println("Title matched....Test Pass!");
		}else
		{
			System.out.println("Title not matched...Test Fail");
			
		}
		
		
		//close the browser close() quit()
		
		driver.quit();
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
