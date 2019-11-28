package com.automationpractice.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Login {
	
	
	@Test
	public void t1() {
		
	}
	
	
	@Test
	public void t2() {
		
	}
	
	
	public void t3() {
		
	}

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Go to http://www.automationpractice.com
		driver.get("http://automationpractice.com/index.php");
		//Click Sign in button 
		driver.findElement(By.className("login")).click();
		
		//Enter invalid email address 
		driver.findElement(By.id("email")).sendKeys("abc@yahoo.com");
		//Click Sign in button
		driver.findElement(By.id("SubmitLogin")).click();
		
		//Verify error message displayed 'Create and Account'
		String createAccount = driver.findElement(By.className("page-subheading")).getText();
		System.out.println(createAccount);
		
		
		

	}

}
