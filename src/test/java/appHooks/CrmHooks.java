package appHooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.BrowserProvider;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CrmHooks 
{
	
	public WebDriver driver;
	@Before
	public void setup()
	{
		System.out.println("Browser setup is initiated!");
		//driver=new ChromeDriver();
		driver=BrowserProvider.setDriver("chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@After
	public void tearDown()
	{
		System.out.println("close the driver session");
		driver.quit();
	}
	

}
