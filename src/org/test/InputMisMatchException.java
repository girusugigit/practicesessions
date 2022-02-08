package org.test;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class InputMisMatchException {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter reg no");
	int ne = s.nextInt();
	System.out.println("emp reg number is"+ne);
}
}
