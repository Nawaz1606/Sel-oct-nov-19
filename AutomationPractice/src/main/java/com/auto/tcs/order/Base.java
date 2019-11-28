package com.auto.tcs.order;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Base {
	@BeforeSuite
	public void setupDriver() {
		System.err.println("driver inititated - before testng executes suite");
	} 
	
	
	@BeforeTest
	public void beforeEachTest() {
		System.out.println("reporting test set running");
	}
}
