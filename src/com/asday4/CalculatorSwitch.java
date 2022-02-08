package com.asday4;

import java.util.Scanner;

public class CalculatorSwitch {
public static void main(String[] args) {
	Scanner number = new Scanner(System.in);
	
	
	System.out.println("Enter number A");
	double integer1 = number.nextDouble();
	System.out.println("Enter number B");
	double integer2 = number.nextDouble();
	System.out.println("Enter the operator");
	char symbol = number.next().charAt(0);
	double result;
	
	switch (symbol) {
	case '+':
		result=integer1 + integer2;
		System.out.println("addition of 2 numbers \n"+result);
		break;
		
	case '-':
		result = integer1 - integer2;
		System.out.println("Subtraction of 2 numbers"+result);
		break;
		
	case '/':
		result = integer1 / integer2;
		System.out.println("The division of 2 numbers is\n"+result );
		break;
		
	case '*':	
		result = integer1*integer2;
		System.out.println("The multiplication of 2 numbers is\n"+result);
		break;

	default:
		break;
	}
}
}
