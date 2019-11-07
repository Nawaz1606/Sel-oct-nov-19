package com.timentraining.misc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitAndExplicitDemo {
	
	
	@Test
	public void implicitWaitDemo() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.get("http://timeandtraining.net/seleniumdemo/selenium.html");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
	}
	
	@Test
	
	public void explicitWaitDemo() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://timeandtraining.net/seleniumdemo/selenium.html");
		
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.textToBe(By.xpath("(//p)[5]"), "“Dream is not the thing you see in sleep but is that thing that doesn't let you sleep.”"));
		String quote = driver.findElement(By.xpath("(//p)[5]")).getText();
		Assert.assertEquals(quote, "“Dream is not the thing you see in sleep but is that thing that doesn't let you sleep.”");
		
	}
	

}
