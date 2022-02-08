package org.test;

public class InheritanceClassB extends InheritanceClassA{
	static void penalty() {
		System.out.println("If the payment of emi is failed we need to pay penalty");

	}
 public static void main(String[] args) {
	InheritanceClassB process = new InheritanceClassB();
	process.Loan();
	process.emi();
	process.roi();
	System.out.println(rate);
	System.out.println(s);
	penalty();
}
}

