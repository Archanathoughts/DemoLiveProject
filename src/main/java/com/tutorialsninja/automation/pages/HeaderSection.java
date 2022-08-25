package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class HeaderSection {
	public HeaderSection()
	{
		PageFactory.initElements(Base.driver, this);
	}

	@FindBy(xpath="//span[text()=\"My Account\"]")
	public static WebElement myAccountlink;
	
	@FindBy(linkText="Register")
	public static WebElement register;
	
	@FindBy(linkText="Login")
	public static WebElement login;
	
	@FindBy(css="input[type='text'][name='search']")
	public static WebElement searchTextbox;
	
	@FindBy(css="button[class$='btn-lg']")
	public static WebElement searchButton;
	
	@FindBy(xpath="//span[text()='Shopping Cart']")
	public static WebElement viewShoppingCartOptions;

	public static void navigateToLoginPage()
	{
		Elements.click(myAccountlink);
		Elements.click(login);
	}
	
	public static void searchProduct() {
		Elements.TypeText(HeaderSection.searchTextbox,Base.reader.getProduct());
		Elements.click(HeaderSection.searchButton);
	}
	public static void navigateToShoppingCartPage()
	{
		Elements.click(viewShoppingCartOptions);
	}
	
	
}
