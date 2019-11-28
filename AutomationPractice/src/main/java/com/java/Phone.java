package com.java;

public class Phone {
	
	private String m = "Samsung Galaxy s10";
	private String n = "9876543210";
	
	public Phone() {
		
	}
	public Phone(String model, String number) {
		m = model;
		n = number;
	}
	
	
	public void showModel() {
		System.out.println(m);
	}
	
	public void showNumber() {
		System.out.println(n);
	}
	
	

}
