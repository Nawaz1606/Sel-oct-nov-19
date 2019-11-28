package com.java;

public class MultiArray {

	public static void main(String[] args) {
		
		
		String    [] citiesOfUsa = {
									
									"New york",
									"Washington DC",
									"Baltimore",
									"Atlanta"
				
								};
		
		
		String    [] citiesOfUk = {
									"Manchester",
									"London",
									"Cambridge",
									"Leeds"
								};
		
		String    [] citiesOfBangladesh = {"Dhaka","Sylhet","Ishwardi","Chittagong"};
		
		
		Integer       [] myNums = {
								10, 
								158, 54
								
								};
		
		
		
		Object[]  [] arrayOfVariousCountriesCities = {
														citiesOfBangladesh,
														citiesOfUk,
														myNums
													 };
		
		
		System.out.println(arrayOfVariousCountriesCities[2][1]);
		

	}

}
