package org.controlstatements;

import java.util.Scanner;

public class Day4Task1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the age");
		int age = s.nextInt();
		if (age >= 18) {
			System.out.println("Eligible to vote");
		} else {
			System.out.println("not Eligible to vote");
		}
	}
}
