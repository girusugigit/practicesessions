package com.asday4;

import java.util.Scanner;

public class ScannerCalculator extends Calculator {
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("Enter the value of A:");
	int A =s.nextInt();
	System.out.println("Enter value of B:");
	int B=s.nextInt();
	add(A,B);
	mul(A,B);
	div(A,B);
	sub(A,B);
	//System.out.println("Addition of 2 numbers"+c);
	
	
}
}
