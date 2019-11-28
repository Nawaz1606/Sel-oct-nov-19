package com.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automationpractice.framework.TestBase;

public class ArrayListDemo extends TestBase{

	
	@Test
	public void arrayList() {
		driver.get("https://washingtondc.craigslist.org/");
		
//		driver.findElement(By.xpath("//a[text()='allentown']")).click();
//		driver.navigate().back();
		
		
		WebElement parent= driver.findElement(By.xpath("//ul[preceding-sibling::h5[text()='nearby cl']]"));
		
		List<WebElement> links = parent.findElements(By.tagName("li"));
		
		for(WebElement e:links) {
			System.err.println(e.getText() + "---" + e.findElement(By.tagName("a")).getAttribute("href"));
//			e.findElement(By.tagName("a")).click();
//			driver.navigate().back();
			
		}
		
	}
	
	
}
