package com.java;

public class JavaArray {

	public static void main(String[] args) {
	
		int[] array = new int[3];
		array[0] = 5;
		array[1] = 1;
		array[2] = 3;
		
		
		System.out.println(findSmallest(array));
		
	

	}
	

	
	public  static int findSmallest(int[] arr) {
		
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
