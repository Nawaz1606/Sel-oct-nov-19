package com.auto.tcs.purchase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.auto.tcs.order.Base;
import com.automationpractice.framework.Utility;

public class OnlinePurchaseTests extends Base{
	
	
	
	
	@BeforeMethod
	public void loginWithUserYY() {
		System.out.println("logged in as user YY");		
	}
	
	@Test
	public void onlinePurchase() {
		
		System.out.println("online1");
	}
	
	
	@Test
	public void onlinePurchase2() {
		
		System.out.println("online2");
	}
	@Test
	public void onlinePurchase3() {
		
		System.out.println("online3");
	}
}
