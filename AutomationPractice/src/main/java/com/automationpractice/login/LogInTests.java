package com.automationpractice.login;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.framework.TestBase;
import com.automationpractice.framework.UI;
import com.automationpractice.framework.Utility;

public class LogInTests extends TestBase{
	
	@Test
	public void login_with_invalid_userid_001___UI() {
		//Go to http://www.automationpractice.com
		UI ui = new UI(driver);
		ui.openURL("http://automationpractice.com/index.php");
		
		//Click Sign in button 
		ui.clickByClass("login");
		
		//Enter invalid email address 
		ui.sendKeysByID("email", "abc@yahoo.com");
		
		//Click Sign in button
		ui.clickById("SubmitLogin");
		
		
		//Verify error message displayed 'Create and Account'
		String createAccount = driver.findElement(By.xpath("//h3[text()='Create an account']")).getText();
		Assert.assertEquals(createAccount, "CREATE AN ACCOUNT");
		
		ui.takeScreenshot();
		
		
	}
	@Test
	public void login_with_invalid_userid_001() {
	
		
		//Go to http://www.automationpractice.com
		driver.get("http://automationpractice.com/index.php");
		//Click Sign in button 
		driver.findElement(By.className("login")).click();
		
		//Enter invalid email address 
		driver.findElement(By.id("email")).sendKeys("abc@yahoo.com");
		//Click Sign in button
		driver.findElement(By.id("SubmitLogin")).click();
		
		//Verify error message displayed 'Create and Account'
		String createAccount = driver.findElement(By.xpath("//h3[text()='Create an account']")).getText();
		Assert.assertEquals(createAccount, "CREATE AN ACCOUNT");
		
	}
	
	@Test
	public void Login_with_valid_userid_and_password_003() {
		
		
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
		String myAccount = driver.findElement(By.xpath("//h1[text()='My account']")).getText();
		Assert.assertEquals(myAccount, "MY ACCOUNT");
		
	
			
			
		
	}
	
	

}
