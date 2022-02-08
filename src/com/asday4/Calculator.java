package com.asday4;

public class Calculator {
 static int add(int a ,int b) {
 System.out.println("addition 2 numbers\n"+(a+b));
return a+b;

}
 static int mul(int c,int d) {
	System.out.println("multiplication of 2 numbers\n"+(c*d));
	return c*d;

}
 static void sub(int d,int c) {
System.out.println("Subtraction of 2 numbers\n"+(d-c));
}
 static int div(int b,int a) {
System.out.println("Division of 2 numbers \n"+(b/a));
return b/a;
}
 
 public static void main(String[] args) {
	Calculator fun =new Calculator();
	fun.add(5, 7);
	fun.mul(8, 9);
	fun.sub(10, 5);
	fun.div(80, 10);
}
}
