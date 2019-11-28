package com.java;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\rkreja\\git\\Selenium-oct-nov-19_2\\AutomationPractice\\screenshots\\test.jpeg");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
