package com.timentraining.misc;

import org.testng.annotations.Test;

import com.automationpractice.framework.TestBase;
import com.automationpractice.framework.Utility;

public class FileUploadDemo extends TestBase{

	
	
	
	@Test
	public void uploadFile() {
		ui.openURL("https://timeandtraining.net/seleniumdemo/selenium.html");
		
		ui.sendKeysByID("demoFileUpload", "F:\\Time And Training\\Demo Folder\\postman.png");
		
		Utility.sleep(5);
		
	}
	

}
