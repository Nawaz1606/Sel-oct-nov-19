package com.timentraining.misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automationpractice.framework.TestBase;
import com.paulhammant.ngwebdriver.NgWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rkreja extends TestBase{

	
	@Test
	public void angular() {
		
		driver.get("http://testleaf.herokuapp.com/pages/radio.html");
		
		List<WebElement> radio_buttons = driver.findElements(By.name("news"));
		
		for(WebElement e: radio_buttons) {
			System.out.println(e.isSelected());
		}
		
	}
	@Test
	public void scroll() {
		
		driver.get("http://testleaf.herokuapp.com/home.html");
		
		JavascriptExecutor javascriptExecutor = ((JavascriptExecutor)driver);
		javascriptExecutor.executeScript("arguments[0].setAttribute('style', 'border: red; border: 2px solid red;');", driver.findElement(By.xpath("//a[@href='pages/checkbox.html']")));
		javascriptExecutor.executeScript("arguments[0].setAttribute('style', 'border: red; border: 0px solid white;');", driver.findElement(By.xpath("//a[@href='pages/checkbox.html']")));
		
		
	}
	
}
