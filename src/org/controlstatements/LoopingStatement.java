package org.controlstatements;

public class LoopingStatement {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) {
			System.out.println("Be positive always");
		}

		int m = 5;
		for (int i = 0; i <= m; i++) {
			System.out.println(i);
		}
		int sum = 0;
		int g = 50;
		for (int i = 0; i <= g; i++) {

			sum += i;
		}
		System.out.print("the sum is \n" + sum);
		System.out.println();

		int[] a = { 3, 5, 6, 7, 8 };
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
