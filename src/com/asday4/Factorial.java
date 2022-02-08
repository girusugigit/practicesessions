package com.asday4;

import java.util.Scanner;

public class Factorial {
static int fact(int n) {

	int output;
	if(n==1) {
	return 1;
	}

	output = fact(n-1)*n;
	return output;
	
}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter  number");
	int num=s.nextInt();
	System.out.println(fact(num));;
	
}
}

	


