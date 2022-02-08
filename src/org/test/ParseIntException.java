package org.test;

public class ParseIntException {
	public static void main(String[] args) {
		String s1 = "78967ghnk";
		System.out.println(s1+100);
		 int pa = Integer.parseInt(s1);
		 System.out.println(pa+100);
	}
	
}
