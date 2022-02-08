package org.test;

public class ExceptionTask2 {
//Step 2
	private void m1() {
		m2();//step 3
		System.out.printf("1\n");//step 12
	}
//Step 4
	private void m2() {
		m3();//Step 5
		System.out.printf("2\n");//step 11
	}
//Step 6
	private void m3() {
		System.out.printf("3\n");//Step 7
		try {                        //step 8
			int sum = 4 / 0;
			System.out.printf("4\n");
		} catch (ArithmeticException e) {
			System.out.printf("5\n"); //step 9
		}

		System.out.printf("7\n");//step 10
	}
  //Step 1
	public static void main(String[] args) {
		ExceptionTask2 obj = new ExceptionTask2();
		obj.m1();
	}

	{

	}
}
