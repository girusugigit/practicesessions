package org.test;

public class Sample6Exception {
	public static void main(String[] args) throws AgeInvalidException {
		int age = 18;
		if (age == 28) {
			System.out.println("Eligible to vote");
		} else {
			try {
				throw new AgeInvalidException();
			} finally {
				System.out.println("finally");
			}
		}
	}
}
//throws supress the exception