package com.timentraining.misc;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGDataProvider {
	
	
	
	@Test(dataProvider = "getMortgageCalculationData")
	public void calculateMortgage(long loanAmount, long downPayment, int lengthOfLoan, double interestRate) {
		System.out.println("Calculating mortgae payment for:\n"
				+ "Loan aamount: "+ loanAmount + "\n"
				+ "Down payment: "+ downPayment+ "\n"
				+ "length of loan: "+ lengthOfLoan+ "\n"
				+ "interest rate: "+ interestRate);
		
	}
	
	@DataProvider(name = "getMortgageCalculationData")
	public Object[][] getMortgageCalculationData() {
		Object[][] obj = {
				{325000,15000,30,3.2},
				{427000,45000,30,3.4},
				{510000,35000,30,3.87}
				
		};
		
		return obj;
	}

}
