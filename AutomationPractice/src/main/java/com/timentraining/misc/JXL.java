package com.timentraining.misc;

import java.io.File;
import java.io.IOException;
import java.util.Stack;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.WorkbookParser;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class JXL {

	public static void main(String[] args) throws IOException, WriteException {
		String s = "abc";
		s.length();
		StringBuilder stringBuilder  = new StringBuilder(s);
		System.out.println(stringBuilder.reverse());
		/*
		 * Workbook workbook ; Workbook wb = null; try {
		 * 
		 * 
		 * 
		 * 
		 * wb = Workbook.getWorkbook(new
		 * File("F:\\Time And Training\\Demo Folder\\r.xls")); Sheet sheet =
		 * wb.getSheet("Sheet1");
		 * 
		 * System.out.println(sheet.getCell("A1").getContents());
		 * 
		 * 
		 * } catch (Exception e) { e.printStackTrace();
		 * 
		 * }finally{ System.out.println("closing"); wb.close(); }
		 * 
		 * 
		 */	}

}
