package com.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UI2 {

	private WebDriver d;
	
	
	public UI2(WebDriver driver) {
		d=driver;
	}
	
	public void clickById(String id) {
		d.findElement(By.id(id)).click();
	}
	
	
}
