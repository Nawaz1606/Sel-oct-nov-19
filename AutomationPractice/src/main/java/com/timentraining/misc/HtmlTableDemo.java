package com.timentraining.misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automationpractice.framework.TestBase;
import com.automationpractice.framework.Utility;

public class HtmlTableDemo extends TestBase{
	@Test
	public void table2_1() {
		
		int[] numbers = new int[3];
		
		driver.get("file:///F:/Time%20And%20Training/Demo%20Folder/HtmlTableDemo/table3.html");
		
		//get the count of column
		List<WebElement> cols =driver.findElements(By.xpath("//td[2]"));		
		
		
		for(int i=0; i<cols.size(); i++) {
			
			String colValue = cols.get(i).getText();
			
			String colValueWithoutPercentile =  colValue.replace("%", "");
			
			int txtToNumber = Integer.parseInt(colValueWithoutPercentile);
			
			numbers[i] = txtToNumber;
			
		}
		int minimum = Utility.findSmallestIndexFromAnArray(numbers);
	
		driver.findElement(By.xpath("(//input[parent::td[parent::tr]])["+(minimum+1)+"]")).click();
		
		
		
		
	}
	@Test
	public void table2() {
		
		int[] numbers = new int[3];
		
		driver.get("file:///F:/Time%20And%20Training/Demo%20Folder/HtmlTableDemo/table3.html");
		
		//get the count of column
		List<WebElement> cols =driver.findElements(By.xpath("//td[2]"));		
		
		
		for(int i=0; i<cols.size(); i++) {
			
			String colValue = cols.get(i).getText();
			
			String colValueWithoutPercentile =  colValue.replace("%", "");
			
			int txtToNumber = Integer.parseInt(colValueWithoutPercentile);
			
			numbers[i] = txtToNumber;
			
		}
		int minimum = Utility.findSmallestIndexFromAnArray(numbers);
	
		driver.findElement(By.xpath("(//input[parent::td[parent::tr]])["+(minimum+1)+"]")).click();
		
		
		
		
	}
	

	
	

	
	@Test
	public void table() {
		
		driver.get("http://testleaf.herokuapp.com/pages/table.html");
		
		//get the count of column
		int col =driver.findElements(By.xpath("//table/tbody/tr/th")).size();		
		System.out.println("Column count: "+ col);
		
		//get the count of row
		int row =driver.findElements(By.xpath("//table/tbody/tr")).size();		
		System.out.println("Row count: "+ (row-1));
		
		
		
		driver.get("file:///F:/Time%20And%20Training/Demo%20Folder/HtmlTableDemo/table2.html");
		String txt =driver.findElement(By.xpath("//tr[child::td/font[contains(text(),'Learn to interact with')]]/td[2]")).getText();
		System.out.println(txt);
		
		//
		
		
	}

}
