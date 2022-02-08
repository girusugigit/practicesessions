package org.test;

public class AgeInvalidException extends Exception {
public String getMessage() {
	String reason = "age not suitable";
	return reason;
}
}
