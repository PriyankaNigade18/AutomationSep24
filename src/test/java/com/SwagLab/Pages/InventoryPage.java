package com.SwagLab.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage 
{
	 private WebDriver driver;
	 
	 public InventoryPage(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
	 }
	
	 //locator
	 
	 @FindBy(xpath="//div[@class='inventory_list']//div[@class='inventory_item_name ']")
	 List<WebElement> totalProduct;
	 
	 @FindBy(xpath="//button[text()='Add to cart']")
	 WebElement addtocartBtn;
	 
	 @FindBy(xpath="//a[@class='shopping_cart_link']")
	 WebElement cartOption;
	 
	 //methods
	 
	 
	 public int getProductCount()
	 {
		 return totalProduct.size();
	 }
	 
	 public void getProductDetails()
	 {
		 System.out.println("Products detials.....");
		 
		 for(WebElement i:totalProduct)
		 {
			 System.out.println(i.getText());
		 }
		 
	 }
	 
	 public void addProductToCart(String pname)
	 {
		 
		 for(WebElement i:totalProduct)
		 {
			 if(i.getText().contains(pname))
			 {
				i.click();
				break;
			 }
				 
		
		 }
		 
		 addtocartBtn.click();
		 System.out.println("Product added to cart: "+pname);
		 
		 
		 
	 }
	 
	 
	 public CartPage openCartPage()
	 {
		 cartOption.click();
		 //navigating to cart page
		 return new CartPage(driver);
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
