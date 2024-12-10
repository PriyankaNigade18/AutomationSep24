package stepdef;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class GoogleSteps
{
	WebDriver driver;
	String actTitle;
	@Given("Open Google application")
	public void open_google_application() 
	{
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
	   
	}

	@When("user get the actual title")
	public void user_get_the_actual_title() {
	    
		actTitle=driver.getTitle();
	}

	@Then("title should matched with Google")
	public void title_should_matched_with_google() {
	    
		Assert.assertEquals(actTitle,"Google");
		System.out.println("Title matched! Title is: "+actTitle);
	}

	@When("user enters valid keyword {string} in search box")
	public void user_enters_valid_keyword_in_search_box(String keyword) {
	   
		driver.findElement(By.id("APjFqb")).sendKeys(keyword);
	}

	@Then("User should valid search result")
	public void user_should_valid_search_result() {
	   List<WebElement> list=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
	   for(WebElement i:list)
	   {
		   System.out.println(i.getText());
	   }
	   
	   
	   
	}



}
