package com.timentraining.misc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownDemo {
	
	@Test
	
	public void dropDrownlanugage (){
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://timeandtraining.net/seleniumdemo/selenium.html");
		WebElement dropdown = driver.findElement(By.xpath("(//select[@name='DemoDropDown'])[1]"));
		Select languangeDropDrown = new Select(dropdown);
		languangeDropDrown.selectByValue("3");
		
		
		
	}
	
	@Test
	public void fileUpload() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://timeandtraining.net/seleniumdemo/selenium.html");
		driver.findElement(By.xpath("//input[@id='demoFileUpload']")).sendKeys("C:\\Users\\farzad\\Documents\\fileupload\\file.txt");
		
		
	}
}
