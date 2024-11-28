package com.SwagLab.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage 
{
	private WebDriver driver;
	
	
	public CartPage(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//locators
	@FindBy(xpath="//button[text()='Remove']")
	WebElement removeBtn;
	
	@FindBy(id="continue-shopping")
	WebElement continueBtn;
	
	@FindBy(id="checkout")
	WebElement checkBtn;
	
	@FindBy(xpath="//div[@class='inventory_item_name']")
	WebElement product;
	
	//methods
	
	public void removeProduct()
	{
		String productText=product.getText();
		System.out.println("Product to be remove: "+productText);
		removeBtn.click();
		System.out.println("Product removed: "+productText);

	}
	
	public InventoryPage continueShopping()
	{
		
		continueBtn.click();
		//navigate to inventory page
		return new InventoryPage(driver);
	}
	
	public void launchCheckoutPage()
	{
		checkBtn.click();
		//navigating to check out page
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
