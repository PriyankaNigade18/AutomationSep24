package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class AmazonSteps
{
	public WebDriver driver;
	String actTitle;
	@Given("Open Amazon application")
	public void open_amazon_application() {
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.amazon.in");
	}

	@When("User get the title of homepage")
	public void user_get_the_title_of_homepage() {
	    actTitle=driver.getTitle();
	}

	@Then("title should matched with homepage title")
	public void title_should_matched_with_homepage_title() {

		Assert.assertTrue(actTitle.contains("India"));
		System.out.println("Home page title matched: "+actTitle);
		
	}

	@When("User open Sell page")
	public void user_open_sell_page() {
	    driver.findElement(By.linkText("Sell")).click();
	}

	@When("User get the title of Sell page")
	public void user_get_the_title_of_sell_page() {

		actTitle=driver.getTitle();
	}

	@Then("Title should matched with SellPage Title")
	public void title_should_matched_with_sell_page_title() {
		Assert.assertTrue(actTitle.contains("Categories"));
		System.out.println("Sell page title matched: "+actTitle);
	}

	@When("User open BestSellers page")
	public void user_open_best_sellers_page() {

		driver.findElement(By.linkText("Best Sellers")).click();
	}

	@When("User get the title of BestSellers page")
	public void user_get_the_title_of_best_sellers_page() {
		actTitle=driver.getTitle();
	}

	@Then("Title should matched with BestSellers page Title")
	public void title_should_matched_with_best_sellers_page_title() {
		Assert.assertTrue(actTitle.contains("Bestsellers"));
		System.out.println("Bestsellers page title matched: "+actTitle);
	}

	@When("User open Mobile page")
	public void user_open_mobile_page() {
	    driver.findElement(By.linkText("Mobiles")).click();
	}

	@When("User get the title of  Mobile page")
	public void user_get_the_title_of_mobile_page() {
		actTitle=driver.getTitle();
	}

	@Then("Title should matched with  Mobile page Title")
	public void title_should_matched_with_mobile_page_title() {
		Assert.assertTrue(actTitle.contains("Phones"));
		System.out.println("Mobiles page title matched: "+actTitle);
	}


}
