package stepdef;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class OpencartSteps 
{
	public WebDriver driver;
	@Given("user open the register page of opencart")
	public void user_open_the_register_page_of_opencart() {
	    
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
	}

	@When("user enters appropriate data")
	public void user_enters_appropriate_data(DataTable table) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.

		List<Map<String,String>> data=table.asMaps();
		driver.findElement(By.id("input-firstname")).sendKeys(data.get(0).get("fname"));
		driver.findElement(By.id("input-lastname")).sendKeys(data.get(0).get("lname"));
		driver.findElement(By.id("input-email")).sendKeys(data.get(0).get("email"));
		driver.findElement(By.id("input-telephone")).sendKeys(data.get(0).get("telephone"));
		driver.findElement(By.id("input-password")).sendKeys(data.get(0).get("password"));
		driver.findElement(By.id("input-confirm")).sendKeys(data.get(0).get("cpassword"));
		
	}

	@When("user select yes newsletter")
	public void user_select_yes_newsletter() {
	    driver.findElement(By.xpath("//label[normalize-space()='Yes']//input[@name='newsletter']")).click();
	}

	@When("check the privacy policy checkbox")
	public void check_the_privacy_policy_checkbox() {

		driver.findElement(By.name("agree")).click();
	}

	@When("click on Continue button")
	public void click_on_continue_button() {

		driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}

	@Then("user should be register into application")
	public void user_should_be_register_into_application() {
	    	Assert.assertTrue(driver.getCurrentUrl().contains("account"));
	    	System.out.println("User registration is completed!");
	}

	


}
