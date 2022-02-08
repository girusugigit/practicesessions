package org.test;

public class UserDefinedException1 {
public static void main(String[] args) {
	int age =18;
	if(age ==28) {
		System.out.println("Eligible to vote");
	}
	else {
		try {
			throw new AgeInvalidException();
		}
		catch(AgeInvalidException e) {
			e.printStackTrace();
		}
	}
}
}
