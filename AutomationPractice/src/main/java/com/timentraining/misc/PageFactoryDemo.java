package com.timentraining.misc;

import org.testng.annotations.Test;

import com.automationpractice.framework.TestBase;
import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.OrderHistroyPage;
import com.automationpractice.pages.PageManager;
import com.automationpractice.pages.SigninPage;

public class PageFactoryDemo extends TestBase{
	
	@Test
	public void signIntc() {
		
		
		ui.openURL("http://automationpractice.com/");
		
		HomePage homePage = PageManager.getHomePage(driver);
		homePage.button_signin.click();
		
		
		SigninPage signinPage = new SigninPage(driver);
		signinPage.loginWithUseridAndPassword("abc213@mailinator.com", "abc1234");
//		signinPage.textbox_signinemail.sendKeys("abc213@mailinator.com");
//		signinPage.textbox_password.sendKeys("abc");
//		signinPage.button_signin.click();
//		String errorMsg = signinPage.element_errormsg.getText();
//		
//		System.err.println(errorMsg);
		
	}
	
	@Test
	public void searchSummerDress() {
		
		
		ui.openURL("http://automationpractice.com/");
//		ui.clickByClass("login");
		HomePage homePage = PageManager.getHomePage(driver);
		homePage.textbox_search.sendKeys("summer dress");
		homePage.button_searchIcon.click();
	}
	
	@Test
	public void displayAllTshirts() {
		ui.openURL("http://automationpractice.com/");
		HomePage homePage = new HomePage(driver);
		homePage.button_tshirtTab.click();
		
	}
	
	
	@Test
	public void viewCart() {
		ui.openURL("http://automationpractice.com/");
		HomePage homePage = new HomePage(driver);
		homePage.button_cart.click();
	}

}
