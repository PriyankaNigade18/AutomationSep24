package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import appHooks.CrmHooks;
import generic.BrowserProvider;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CrmStpes // extends CrmHooks
{
//	public WebDriver driver;
//	@Before
//	public void setup()
//	{
//		System.out.println("Browser setup is initiated!");
//		driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	}
//	
//	@After
//	public void tearDown()
//	{
//		System.out.println("close the driver session");
//		driver.quit();
//	}
//	

	WebDriver driver=BrowserProvider.getDriver();
	@Given("user open {string} application")
	public void user_open_application(String url) {
		//driver=new ChromeDriver();
		driver.get(url);
		
	}

	@When("User click on SignIn link")
	public void user_click_on_sign_in_link() {
	    driver.findElement(By.linkText("Sign In")).click();
	    
	}

	@Then("It should navigate to login page")
	public void it_should_navigate_to_login_page() {

		Assert.assertTrue(driver.getCurrentUrl().contains("login"));
		System.out.println("User is navigating to login page");
	}

	@When("user enter valid email {string} and password {string}")
	public void user_enter_valid_email_and_password(String email, String psw) {
	  
		driver.findElement(By.id("email-id")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(psw);
	}

	@When("User click on crm Submit button")
	public void user_click_on_crm_submit_button() {

		driver.findElement(By.id("submit-id")).click();
	}

	@Then("user should navigate customers page")
	public void user_should_navigate_customers_page() {
	    	Assert.assertTrue(driver.getCurrentUrl().contains("customers"));
	    	System.out.println("Login Completed!");
	}

}
