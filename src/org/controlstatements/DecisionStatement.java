package org.controlstatements;

public class DecisionStatement {
	public static void main(String[] args) {
		int i = 10;
		int A = 10;
		int B = 20;
		int C = 30;

		// IF statement
		if (i < 20) {
			System.out.println(+i + "\n is less than 20");
		}
		// If-Else Statement
		if (A > B) {
			System.out.println("A is greater than B");
		} else {
			System.out.println("B is greater than A");
		}
		// Nested If
		if (A > B) {
			System.out.println("A is greater than B");
		}
		if (A > C) {
			System.out.println("A is greater than C");
		}
		System.out.println("B and C are greater than A");
		System.out.println();

		// Ladder if
		if (A > B) {
			System.out.println("A is greater");
		} else {
			System.out.println("B is greater");

		}
		if (B > C) {
			System.out.println("B is greater than C");
		} else {
			System.out.println("C is greater than B");
		}
		if (C > A) {
			System.out.println("C is greater than A");
		} else {
			System.out.println("A is greater than C");

		}
	}
}
