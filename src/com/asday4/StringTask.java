package com.asday4;

public class StringTask {
private static char[] tempCharArray;

public static void main(String[] args) {
	char[] helloarray = {'h','e','l','l','o'};
	String hellostring = new String(helloarray);
	System.out.println(hellostring);
	
	String h2="hello beautiful";
	
	String h="hello the world is a beautiful place to live";
	for (int i = 0; i < h.length(); i++) {
		System.out.println(h.charAt(i));
		
		
		
		
	}
	System.out.println();
	System.out.println(h.length());
	String string ="004-034556";
	String[] parts= string.split("-");
	String part1=parts[0];
	String part2=parts[1];
	System.out.println(part1);
	System.out.println(part2);
	
	}


}
		
	
	//int l=h.length();
	//System.out.println(l);


