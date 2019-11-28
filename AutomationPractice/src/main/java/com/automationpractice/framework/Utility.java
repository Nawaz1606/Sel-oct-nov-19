package com.automationpractice.framework;

public class Utility {
	
	
	public static void sleep(int seconds) {
		try {
			Thread.sleep((seconds*1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static int findSmallestIndexFromAnArray(int[] arr) {
		
		  int index = 0;
	      int min = arr[index];

	       for (int i=1; i<arr.length; i++) {

	           if (arr[i] < min) {
	               min = arr[i];
	               index = i;
	           }
	       }
	       return index;
		
	}

}
