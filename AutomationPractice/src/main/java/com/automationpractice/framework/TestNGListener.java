package com.automationpractice.framework;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		ITestListener.super.onTestStart(result);
		ExtentManager.step = ExtentManager.reporter.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		ITestListener.super.onTestSuccess(result);
		ExtentManager.step.pass("Test is passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		ITestListener.super.onTestFailure(result);
		ExtentManager.step.fail("Test failed");
	}

	
	
	
}
