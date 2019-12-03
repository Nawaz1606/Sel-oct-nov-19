package com.automationpractice.framework;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UI{
	private WebDriver d;

	
	public void takeScreenshot() {
	TakesScreenshot takesScreenshot = (TakesScreenshot) d;
		
		File sourcefile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		File destinationFile = new File(System.getProperty("user.dir")+"\\screenshots\\screenshot.png");
		
		try {
			FileUtils.copyFile(sourcefile, destinationFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private WebElement highlight(WebElement e) {
		JavascriptExecutor javascriptExecutor = ((JavascriptExecutor)d);
		javascriptExecutor.executeScript("arguments[0].setAttribute('style','border: blue; border: 2px solid blue');", e);
		return e;
	}
	
	public UI(WebDriver driver) {
		d=driver;
	} 
	
	
	public void openURL(String url) {
		
		d.get(url);
	}
	
	
	
	//CLICKS
	public void clickByClass(String className) {
		try {
			highlight(d.findElement(By.className(className))).click();
		} catch (Exception e) {
			
			//Report.reportFailure(e.getMessage());
		}
	}
	
	public void clickById(String id) {
		highlight(d.findElement(By.id(id))).click();
		
	}
	public void clickByXpath(String xpath) {
		highlight(d.findElement(By.xpath(xpath))).click();
		
	}
	public void clickByName(String name) {
		highlight(d.findElement(By.xpath(name))).click();
	}
	public void clickByCssSelector(String css) {
		highlight(d.findElement(By.cssSelector(css))).click();
		
	}
	
	//
	
	
	//SEND KEYS
	
	private void sendKeysByElement(WebElement e, String textToType) {
		highlight(e);
		e.sendKeys(textToType);
		ExtentManager.step.info("Typed: "+ textToType);
	}
		
	public void sendKeysByID(String id, String textToType) {
		//
		sendKeysByElement(d.findElement(By.id(id)),textToType);
	}
	public void sendKeysByClass(String className, String textToType) {
		//
		sendKeysByElement(d.findElement(By.className(className)),textToType);
	}
	public void sendKeysByXpath(String xpath, String textToType) {
		//
		sendKeysByElement(d.findElement(By.xpath(xpath)),textToType);
	}
	
	//
	
	public void switchToWindow(int windowNumber){
		
		Set<String> handles = d.getWindowHandles();
		int counter=0;
		for(String h: handles) {
			if(windowNumber == counter) {
				d.switchTo().window(h);
			}
			counter=counter+1;
		}
		
		
	}
	
	
	//WAITS
	
	
	public void explicitly_wait_until_text_tobe_present_by_id(By locator, String text) {
		WebDriverWait webDriverWait = new WebDriverWait(d, 60);
		webDriverWait.until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
		
	}
	
	
	
	
	
}
