package com.automationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(className = "login")
	public WebElement button_signin;	
	
	@FindBy(xpath = "//a[text()='Contact us']")
	public WebElement button_contact_us;
	
	@FindBy(name = "submit_search")
	public WebElement button_searchIcon;
	
	@FindBy(xpath = "(//a[@title='Women' and text()='Women'])[1]")
	public WebElement button_womenTab;
	
	@FindBy(xpath = "(//a[@title='Dresses'])[2]")
	public WebElement button_dressesTab;
	
	@FindBy(xpath = "(//a[@title='T-shirts'])[2]")
	public WebElement button_tshirtTab;
	
	@FindBy(xpath = "//a[@title='View my shopping cart']")
	public WebElement button_cart;
	
	@FindBy(id = "search_query_top")
	public WebElement textbox_search;
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//
	//
	//
	//
	

}
