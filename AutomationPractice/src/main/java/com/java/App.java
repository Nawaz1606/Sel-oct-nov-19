package com.java;

public class App {

	public static void main(String[] args) {
		
		
		
		String str="Hello world";
		String[] strArr= {"Hello World","Welcome","abc","dsewf","fdfdf","moon","earth","jupiter"};
		
		int myNum = 100;
		int[] myNumArr = {10,560,9898,5454};
		
		boolean isWinter = true;
		boolean[] boolArr = {true,true,false,false,false,false,true};
		
		
		
//		System.out.println(strArr[strArr.length-1]);//last element
//		System.out.println(strArr.length);
		
		
		
		for (int i = 0; i < strArr.length ; i++) {
			
			String val = strArr[i];
			
			if (val.equals("moon")) {
				System.err.println("Yes its is MOON");
			}else {
				System.out.println("its not moon. its: "+ val);
			}
			
			
			
		}
		
		/*
		 * 
		 * for (int i = 0; i < strArr.length ; i++) { System.err.println(strArr[i]); }
		 * 
		 * for (int i = 0; i < myNumArr.length ; i++) { System.err.println(myNumArr[i]);
		 * }
		 */
		

	}

}
