package com.automationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {

	@FindBy(id = "email")
	public WebElement textbox_signinemail;
	
	@FindBy(id = "passwd")
	public WebElement textbox_password;
	
	@FindBy(id = "email_create")
	public WebElement textbox_registrationemail;
	
	@FindBy(id = "SubmitLogin")
	public WebElement button_signin;
	
	@FindBy(id = "SubmitCreate")
	public WebElement button_createanaccount;
	
	@FindBy(xpath = "(//div[contains(@class,'alert-danger')])[1]")
	public WebElement element_errormsg;
	
	
	public SigninPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void loginWithUseridAndPassword(String userid, String password) {
		textbox_signinemail.sendKeys(userid);
		textbox_password.sendKeys(password);
		button_signin.click();
	}
	
}
