package com.java.trycatchblock;

import org.testng.annotations.Test;

public class Purchase {

	
	@Test
	public void testOne() {
		
		System.out.println("dsdsd");
		
		
		try {
			System.out.println("went to an url for registration");
			System.out.println("insert data userid, password");
			System.out.println(1/0);
			System.out.println("register using userid and password");
		} catch (Exception e) {
			System.err.println(e.getMessage());
			//report
		}
		finally {
			System.out.println("delete the userid");
		}
		
		
		
		
		/*
		 * try { System.out.println(1/0); } catch (Exception e) {
		 * System.out.println(e.getMessage()); }
		 */		
		
	}
	
	
}
