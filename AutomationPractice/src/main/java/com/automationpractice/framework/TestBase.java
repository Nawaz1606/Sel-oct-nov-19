package com.automationpractice.framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;


@Listeners(TestNGListener.class)
public class TestBase {
	
	 protected EventFiringWebDriver driver;
	 protected UI ui;
	 
	 
	 @BeforeSuite
	 public void beforeSuite() {
		 ExtentManager.getInstance();
	 }
	 
	 
	 @AfterSuite
	 public void afterSuite() {
		 ExtentManager.reporter.flush();
	 }
	 
	
	/*
	 * @BeforeClass public void beforeClass() {
	 * ExtentManager.reporter.createTest(" test class"); }
	 */
	 
		
	@BeforeMethod
	@Parameters({"browser"})
	public void init(@Optional("chrome") String browser) {
		
		
		
		
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new EventFiringWebDriver(new ChromeDriver());
		}else if(browser.equals("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new EventFiringWebDriver(new InternetExplorerDriver());
		}
		

		
		driver.register(new WebDriverListener());
		
		driver.manage().window().setPosition(new Point(1917, 0));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
//		System.out.println(driver.manage().window().getPosition().getX());
//		System.out.println(driver.manage().window().getPosition().getY());
		
		ui = new UI(driver);
	}


	@AfterMethod
	public void closeWindow() {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.close();
	}
}
