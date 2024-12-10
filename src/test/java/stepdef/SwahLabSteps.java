package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class SwahLabSteps {

	WebDriver driver;
	@Given("Open SwagLab application")
	public void open_swag_lab_application() {
	    
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}

	@When("I enter username {string} and password {string}")
	public void i_enter_username_and_password(String un, String psw) {
	    driver.findElement(By.id("user-name")).sendKeys(un);
	    driver.findElement(By.id("password")).sendKeys(psw);
	   
	}

	@When("I clicked on Login button")
	public void i_clicked_on_login_button()
	{
		 driver.findElement(By.id("login-button")).click();
		
	}

	@Then("I should able to login and navigated to Inventory page")
	public void i_should_able_to_login_and_navigated_to_inventory_page() {

		Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
		System.out.println("User Login is completed!");
	}

}
