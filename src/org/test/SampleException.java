package org.test;

public class SampleException {
public static void main(String[] args) {
	System.out.println(0);
	System.out.println(1);
	System.out.println(2);
	try {
		System.out.println(3/0);
	}
	catch(NullPointerException e) {
		throw new StringIndexOutOfBoundsException();
	}
	finally {
		System.out.println("finally");
	}
	System.out.println(4);
	System.out.println(5);
	System.out.println(6);
}
}
