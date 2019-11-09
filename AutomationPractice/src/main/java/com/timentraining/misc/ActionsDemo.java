package com.timentraining.misc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.automationpractice.framework.TestBase;

public class ActionsDemo extends TestBase{
	
	
	@Test
	public void mouseOverByAction() {
		
		driver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
		
		Actions actions = new Actions(driver);
		//WebElement red_button = driver.findElement(By.xpath("//li[contains(@onmouseover,'Red for')]"));
		WebElement green_button = driver.findElement(By.xpath("//li[contains(@onmouseover,'Green for Go..')]"));
		
		
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		actions.moveToElement(green_button).build().perform();
		
		
	}
	
	@Test 
	public void dragAndDropByAction() {
		
		driver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
		
		Actions actions = new Actions(driver);
		WebElement source= driver.findElement(By.id("drag"));
		WebElement target= driver.findElement(By.id("drop"));
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		actions.dragAndDrop(source, target).build().perform();
		
	}
	
	@Test
	public void enterByAction() {
		
			
		//Go to http://www.automationpractice.com
		driver.get("http://automationpractice.com/index.php");
		//Enter 'invalid' in search text box on top
		//driver.findElement(By.id("search_query_top")).sendKeys("Invalid");
		
		Actions actions = new Actions(driver);
		WebElement e = driver.findElement(By.xpath("//input[@name='search_query']"));
		//Now, press Enter using keyboard
		
		actions.moveToElement(e).sendKeys(e, "Invalid").build().perform();
		actions.moveToElement(e).sendKeys(Keys.ENTER).build().perform();
		//actions.moveToElement(e).sendKeys("Invalid").build().perform();
		//.sendKeys(Keys.ENTER)
		
		//actions.moveToElement(e).sendKeys(Keys.ENTER).build().perform();
		
	}
	
	@Test
	public void sendkeyByAction() {
		
			
		//Go to http://www.automationpractice.com
		driver.get("https://www.kayak.com/");
		//Enter 'invalid' in search text box on top
		driver.findElement(By.id("Z36Z-origin")).sendKeys("Invalid");
		
		Actions actions = new Actions(driver);
		WebElement e = driver.findElement(By.id("search_query_top"));
		//Now, press Enter using keyboard
		actions.moveToElement(e).sendKeys(Keys.ENTER).build().perform();
		
	}


}
