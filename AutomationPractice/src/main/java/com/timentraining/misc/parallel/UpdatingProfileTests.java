package com.timentraining.misc.parallel;

import org.testng.annotations.Test;

import com.automationpractice.framework.TestBase;

public class UpdatingProfileTests extends TestBase{
	@Test
	public void updateProfile() {
		driver.get("http://www.bbc.com");
	}
	@Test
	public void updateProfile2() {
		driver.get("http://www.bbc.com");
	}
	@Test(groups = {"smoke"})
	public void updateProfile3() {
		driver.get("http://www.bbc.com");
	}
}
