package com.timentraining.misc;

import org.testng.annotations.Test;

import com.automationpractice.framework.TestBase;

public class JavaScripExecutorDemo extends TestBase{
	
	
	@Test
	public void m() {
		
		ui.openURL("http://testleaf.herokuapp.com/home.html");
		ui.clickByXpath("//a[@href='pages/Edit.html']");
		ui.sendKeysByXpath("(//input)[1]", "a");
		ui.sendKeysByXpath("(//input)[2]", "a");
		ui.sendKeysByXpath("(//input)[3]", "a");
		ui.sendKeysByXpath("(//input)[4]", "a");
		ui.sendKeysByXpath("(//input)[5]", "a");
		
		
	}

}
