package com.automationpractice.pages;

import org.openqa.selenium.WebDriver;

public class PageManager {
	
	
	public static HomePage getHomePage(WebDriver driver) {
		return new HomePage(driver);
	}
	public static OrderHistroyPage getOrderHistoryPage(WebDriver driver) {
		return new OrderHistroyPage();
	}
	public static SigninPage getSigninPage(WebDriver driver) {
		return new SigninPage(driver);
	}
	public static HomePage getContactPage(WebDriver driver) {
		return new HomePage(driver);
	}

}
