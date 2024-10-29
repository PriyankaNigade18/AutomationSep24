package com.webTesting.WebElementScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableAutomation {
  @Test
  public void staticTable()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  //total rows
	  int totalRows=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr")).size();
	  System.out.println("Total rows including heading: "+totalRows);//7
	  System.out.println("Total rows excluding heading: "+(totalRows-1));//6
	  
	  //total columns
	  int totalCells=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr[2]//td")).size();
	  System.out.println("Total columns in table: "+totalCells);//4
	  
	  System.out.println("Table headings are:");
	  //heading
	  List<WebElement> allHeadings=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr[1]//th"));
	  for(WebElement i:allHeadings)
	  {
		  System.out.println(i.getText());
	  }
	  
	  //specific row
	  
	  String row=driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr[5]")).getText();
	  
	  System.out.println("Specific row is:"+row);
	  
	  //specific cell
	  
	  System.out.println("Author column data");
	 List<WebElement>  cell2=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//td[2]"));
	 
	 for(WebElement i:cell2)
	 {
		 System.out.println(i.getText());
	 }
}
  
 @Test
 public void dynamicTable() throws InterruptedException
 {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://testautomationpractice.blogspot.com/");
	 
	 System.out.println("Headings");
	 
	 List<WebElement> headings=driver.findElements(By.xpath("//table[@id='taskTable']//thead//tr//th"));
	 
	 for(WebElement i:headings)
	 {
		 System.out.println(i.getText());
	 }
	 
	 System.out.println("Specific Rows-chrome");
	 
//	 List<WebElement> row3=driver.findElements(By.xpath("//table[@id='taskTable']//tbody//tr[3]//td"));
//	 for(WebElement i:row3)
//	 {
//		 System.out.print(i.getText()+" : ");
//		 
//	 }
 
	 Thread.sleep(2000);
	 List<WebElement> name=driver.findElements(By.xpath("//table[@id='taskTable']//tbody//tr//td[1]"));
	 
	 for(WebElement n:name)
	 {
		 if(n.getText().contains("Chrome"))
		 {
			System.out.print(n.getText());
			List<WebElement> list=driver.findElements(By.xpath("//table[@id='taskTable']//td[text()='Chrome']//following-sibling::td"));
			for(WebElement i:list)
			{
				System.out.print(i.getText()+" ");
			}
			break;
		 }
	 }
	 
	 
	 System.out.println("Column data");
	 
//List<WebElement> cells=driver.findElements(By.xpath("//table[@id='taskTable']//tbody//tr//td[5]"));
//
//for(WebElement i:cells)
//{
//	System.out.println(i.getText());
//}

	 int count=0;
	 
	 for(WebElement i:headings) {
		 
		 count++;
		 if(i.getText().contains("Network (Mbps)"))
		 {
			 System.out.println(i.getText());
			 System.out.println(count);
			 List<WebElement> data=driver.findElements(By.xpath("//table[@id='taskTable']//tbody//tr//td["+count+"]"));
			 for(WebElement k:data)
			 {
				 System.out.println(k.getText());
			 }
		 }
		 
		
	 }
	 
	 
	 System.out.println("complete data");

	 List<WebElement> data=driver.findElements(By.xpath("//table[@id='taskTable']//tbody//tr//td"));

	 for(WebElement i:data)
	 {
		 System.out.print(i.getText()+"  : ");
		 System.out.println();
	 }
	 


 
 }
  
  
  
@Test
public void testPeginationTable()
{
	WebDriver driver=new ChromeDriver();
	 driver.get("https://testautomationpractice.blogspot.com/");
	
	
	int totalPages=driver.findElements(By.xpath("//ul[@class='pagination']//li//a")).size();
	System.out.println("Total pages in the table: "+totalPages);//4
	
	List<WebElement> list=driver.findElements(By.xpath("//ul[@class='pagination']//li//a"));
	//open page number 3--->goto Fitness Tracker and check the checkbox
	for(WebElement i:list)
	{
		if(i.getText().contains("3"))
		{
			i.click();
			driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr[4]//td[4]//input")).click();
			break;
		}
	}
	
	////table[@id='productTable']//tbody//tr[4]//td[text()='Fitness Tracker']//following-sibling::td[2]//input
	
	
	
}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
