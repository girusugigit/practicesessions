package org.test;

public class Sample3Exception {

	public static void main(String[] args) {
		System.out.println(0);
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(4 /2);
			String s = null;
			System.out.println(s.charAt(0));
		} 
		catch (NullPointerException e) {
			System.out.println("Value 1");
		} 
		catch (ArithmeticException e) {
			System.out.println("Value 2");
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("Value 3");
		}

		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
	}
}
