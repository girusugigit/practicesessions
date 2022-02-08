package com.asday4;

import java.util.Scanner;

public class VotingProject {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter the age");
	int age = s.nextInt();
	if (age>=18) {
		System.out.println("eligible to vote");
	} else {
System.out.println("not eligible to vote");
	}
}
}
