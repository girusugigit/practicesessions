package org.test;

public class InheritanceClassA{

	static String s = "Working in IT";
	static int rate = 7;
	int mp = 2000;
	
	void Loan() {
		System.out.println(s);
		System.out.println("Eligible for loan");
		
		

	}
	public void roi() {
		System.out.println("Rate of interest is \n"+rate);

	}
	public void emi() {
		System.out.println("The monthly emi will be\n"+mp);

	}
	public static void main(String[] args) {
		InheritanceClassB.penalty();
	}
}
