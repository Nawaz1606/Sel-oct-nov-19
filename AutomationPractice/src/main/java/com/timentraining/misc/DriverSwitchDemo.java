package com.timentraining.misc;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automationpractice.framework.TestBase;
import com.automationpractice.framework.UI;

public class DriverSwitchDemo extends TestBase{
	
	
	
	@Test
	public void demoSwitchToWindow() {
		
		driver.get("http://testleaf.herokuapp.com/pages/Window.html");
//		String mainWindowHandle = driver.getWindowHandle();
		
		driver.findElement(By.id("home")).click();
		/*
		 * Set<String> handles = driver.getWindowHandles();
		 * 
		 * for(String h: handles) { if(h.equals(mainWindowHandle)) { // }else {
		 * driver.switchTo().window(h); } }
		 */
		UI ui = new UI(driver);
		ui.switchToWindow(1);
		
		driver.findElement(By.xpath("//img[@src='images/image.png']")).click();
		
	}
	
	
	@Test
	public void demoSwitchToFrame() {
		
		driver.get("http://testleaf.herokuapp.com/pages/frame.html");
		
		//
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click1")).click();
		
		driver.switchTo().defaultContent();
		
		
	}
	
	
	

}
