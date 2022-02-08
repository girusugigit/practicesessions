package com.asday4;

import java.util.Scanner;

public class StringTask2 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter String 1");
	String s1=s.next();
	System.out.println("Enter String 2:");
	String s2=s.next();
	
	while (s1.equals(s2)) {
		System.out.println("equal");
		
	}
	System.out.println("not equal");
	}
	
	
}


