package org.controlstatements;

import java.util.Scanner;

public class Day4Task2 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number");
	int number=s.nextInt();
	if (number%2==0) {
		System.out.println("it is even");
	} else {
System.out.println("it is odd");
	}
}
}
