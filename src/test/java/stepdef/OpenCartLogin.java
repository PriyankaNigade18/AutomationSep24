package stepdef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenCartLogin
{
	WebDriver driver;
	@Given("user open the login page")
	public void user_open_the_login_page() {
	    driver=new ChromeDriver();
	    driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}

	@When("user enters valid credentials")
	public void user_enters_valid_credentials(DataTable table) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.

		List<List<String>> data=table.cells();
		
		driver.findElement(By.id("input-email")).sendKeys(data.get(0).get(0));
		driver.findElement(By.id("input-password")).sendKeys(data.get(0).get(1));
		
	}

	@When("user click on login button of cart")
	public void user_click_on_login_button_of_cart() {
	    driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("user should able to login")
	public void user_should_able_to_login() {

		Assert.assertTrue(driver.getCurrentUrl().contains("account"));
		System.out.println("User Login completed!");
	}


}
