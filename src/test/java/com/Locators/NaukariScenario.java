package com.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukariScenario {

	public static void main(String[] args)
	{
		//create a driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));

		System.out.println("Total Links are: "+allLinks.size());
		
		String exp="https://resume.naukri.com/resume-writing-services?fftid=101001";
		for(WebElement i:allLinks)
		{
			System.out.println(i.getText());
			System.out.println(i.getAttribute("href"));
			try {
			if(i.getAttribute("href").contains(exp))
			{
				System.out.println("Link found!");
				break;
			}
			}catch(NullPointerException n)
			{
			System.out.println("Check that Href is null!");	
			}
		}
		
		
		
		
		
	}

}
