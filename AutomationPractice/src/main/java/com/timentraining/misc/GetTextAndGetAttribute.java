package com.timentraining.misc;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automationpractice.framework.TestBase;

public class GetTextAndGetAttribute extends TestBase{
	
	
	
	@Test
	public void getAttributeDemo() {
		
		driver.get("http://automationpractice.com/index.php?id_category=3&controller=category");
		
		
		String txt = driver.findElement(By.xpath("//a[@title='Delivery']")).getText();
		
		String link = driver.findElement(By.xpath("//a[@title='Delivery']")).getAttribute("href");
		
		System.out.println(link);
		
	}

}
