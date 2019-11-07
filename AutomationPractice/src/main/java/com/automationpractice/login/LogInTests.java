package com.automationpractice.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogInTests {
	
	@Test
	public void login_with_invalid_userid_001() {
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
		Assert.assertEquals(createAccount, "CREATE AN ACCOUNT");
		
	}
	
	@Test
	public void Login_with_valid_userid_and_password_003() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Go to http://www.automationpractice.com
		driver.get("http://automationpractice.com/index.php");
		//Click Sign in button 
		driver.findElement(By.className("login")).click();
		
		//Enter invalid email address 
		driver.findElement(By.id("email")).sendKeys("abc213@mailinator.com");
		//Enter valid password 'abc1234' in password text field
		driver.findElement(By.id("passwd")).sendKeys("abc1234");
		//Click Sign in button
		driver.findElement(By.id("SubmitLogin")).click();
		
		//Verify 'MY ACCOUNT' text displayed
		String myAccount = driver.findElement(By.className("page-subheading")).getText();
		Assert.assertEquals(myAccount, "MY ACCOUNT");
		
	
			
			
		
	}
	
	

}
