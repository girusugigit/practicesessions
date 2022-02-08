package org.test;

public class Sample4Exception {
	public static void main(String[] args) {
		System.out.println(0);
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(4/2);
			String s = null;
			System.out.println(s.charAt(0));
		} 
		catch (Throwable e) {
			throw new NullPointerException();
		
		}

		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
	}
}


