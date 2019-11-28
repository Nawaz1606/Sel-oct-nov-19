package com.timentraining.misc;

import org.testng.annotations.Test;

import com.automationpractice.framework.TestBase;

public class ScreenshotDemo extends TestBase{
	
	
	
	@Test
	public void takeScreenshot() {
		
		ui.openURL("https://timeandtraining.net/seleniumdemo/selenium.html");
		ui.takeScreenshot();
		
	}

}
