package org.test;

public class StringIndexOutOfBoundException {
public static void main(String[] args) {
	String s = "null";
	System.out.println(System.identityHashCode(s));
	System.out.println(s.charAt(0));
	System.out.println(s.charAt(5));
}
}
