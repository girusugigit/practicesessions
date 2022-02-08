package com.asday4;

import java.util.Scanner;

public class Triangle {
 static int base;
static int height;
double area;

public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	System.out.println("enter base of triangle\n");
	base =s.nextInt();
	System.out.println("enter height of triangle\n");
	height =s.nextInt();
	System.out.println("Area of triangle is \n"+(0.5)*base*height);
}
}
