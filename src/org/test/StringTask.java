package org.test;

public class StringTask {

	public static void main(String[] args) {
		String S1 = "Greens Technology";
		String S2 = "SeleniumAutomationtool";
		String S3 = "velmurugan";
		String S4 = "j a v a p r o g r a m";
		String S5 = "9095484678";

		// Question 1
		System.out.println("Length of S1\n" + S1.length());
		System.out.println("Length of String S2\n" + S2.length());
		System.out.println("Length of String S3\n" + S3.length());
		System.out.println("Length of String S4\n" + S4.length());
		System.out.println("Length of String S5\n" + S5.length());

		// Question 2
		int lastIndexOf = S1.lastIndexOf('o');
		System.out.println("The Last index of O is \n" + lastIndexOf);

		int IndexOf = S2.indexOf('o');
		System.out.println("The index of O is \n" + IndexOf);

		int IndexOf1 = S3.indexOf("n");
		System.out.println("The index of n is \n" + IndexOf1);

		int LastIndexOf1 = S4.lastIndexOf(" ");
		System.out.println("The Last index of emptyspace is  \n" + LastIndexOf1);

		int LastIndexOf2 = S5.lastIndexOf('8');
		System.out.println("The Last index of 8 is \n" + LastIndexOf2);

		// Question 3
		char charAt = S1.charAt(10);
		System.out.println("The 10th character is \n" + charAt);

		char charAt1 = S2.charAt(11);
		System.out.println("The 11th character is \n" + charAt1);

		char charAt3 = S3.charAt(4);
		System.out.println("The 4rth character is \n" + charAt3);

		char charAt4 = S4.charAt(8);
		System.out.println("The 8th Character is \n" + charAt4);

		char charAt5 = S5.charAt(8);
		System.out.println("The 8th Character is \n" + charAt5);

		// Question 4
		String S6 = "Java";
		String S7 = "Java";
		// equals
		boolean e = S6.equals(S7);
		System.out.println("print true or false \n" + e);

		String S8 = "Java";
		String S9 = "java";
		boolean b = S8.equals(S9);
		System.out.println("print true or false \n" + b);
		// equalsignorecase
		boolean eb = S8.equalsIgnoreCase(S9);
		System.out.println("print true or false \n" + eb);

		String S10 = "Green Technology";
		String S11 = "GreenTechnology.";
		boolean bo = S10.equals(S11);
		System.out.println("print true or false \n" + bo);

		String S12 = "Nisha";
		String S13 = "nisha";
		boolean bn = S12.equalsIgnoreCase(S13);
		System.out.println("Print true or false \n" + bn);

		// Question 7.2
		String n = "Greens Adayar";

		String replace = n.replace("Adayar", "omr");
		System.out.println("\nReplace result is \n" + replace);

		// Question 7.3
		String r1 = "Welcome to java class";
		String replace1 = r1.replace(" ", "#");
		System.out.println("\nReplacement result is \n" + replace1);

		// Question 7.4
		String g1 = "Nishakerala24@gmail.com";
		String replace2 = g1.replace("gmail", "yahoo");
		System.out.println("\nThe replaced email address is \n" + replace2);
		System.out.println("\n");

		// Question 7.5
		String pc = "5-35-2a,venkatesh nivas,Aruppukottai,pincode-626101";
		String replace3 = pc.replace("626101", "");
		System.out.println("\nThe replaced pincode is \n" + replace3);
		System.out.println("\n");

		// Question 8.1
		String St1 = "NISHANTHI";
		String convert1 = St1.toLowerCase();
		System.out.println("\nThe result is \n" + convert1);
		System.out.println();
		System.out.println("\n");

		// Question 8.2
		String St3 = "nishanthi";
		String convert3 = St3.toUpperCase();
		System.out.println("\nThe result is \n" + convert3);
		System.out.println("\n");

		// Question 8.3
		String St2 = "WelcomE";
		String convert2 = St2.toUpperCase();
		System.out.println("\nThe result of conversion is\n" + convert2);
		System.out.println("\n");

		// QUESTION 8.4
		// not completed

		// Question 9.1
		String St6 = "Welcome to Javaclass";
		boolean identify = St6.contains("Welcome");
		System.out.println("Print true or false \n" + identify);
		System.out.println("\n");

		// Question 9.2
		String St7 = "Hai i am nisha";
		boolean check = St7.startsWith("Welcome");
		System.out.println("Print true or False\n" + check);
		System.out.println("\n");

		// Question 9.3
		String St9 = "Welcome to java class";
		boolean checkend = St9.endsWith("class");
		System.out.println("Print yes or no\n" + checkend);
		System.out.println("\n");

		// Question 9.4
		String St13 = "Welcome to java class";
		boolean checks = St13.endsWith("java");
		System.out.println("Check the result \n" + checks);
		System.out.println("\n");

		// Question 9.5
		String st11 = "Welcome to java class";

		if (st11.isEmpty()) {
			System.out.println("Print empty");

		} else {
			System.out.println("\nNot Empty");
			System.out.println("\n");

		}

		// Question 9.6
		String St10 = "";
		boolean checkempty = St10.isEmpty();
		System.out.println("Print true or false\n" + checkempty);
		System.out.println("\n");

		// Question 10

		String Sc1 = " Nisha ";
		String Sc2 = " nisha ";
		boolean c = Sc1.equals(Sc2);
		System.out.println("Compare 2 strings\n" + c);
		System.out.println("\n");

		// Question 10.1

		String Sc4 = "Nia";
		String Sc5 = "nisha";
		boolean d = Sc4.equals(Sc5);
		System.out.println("Compare 2 strings \n" + d);
		System.out.println("\n");

		// Question 11.1- Literal String

		String sh1 = "Nisha";
		String sh2 = "Nisha";

		System.out.println(System.identityHashCode(sh1));
		System.out.println(System.identityHashCode(sh2));
		System.out.println("\n");

		// Question 11.2 - Non-Literal String

		String sh3 = new String("Nisha");
		String sh4 = new String("Nisha");

		System.out.println(System.identityHashCode(sh3));
		System.out.println(System.identityHashCode(sh4));
		System.out.println("\n");
		
		// Question 11.3 - Non-Literal String/mutable/stringbuffer
		
		StringBuilder sh7 = new StringBuilder("Nisha");
		System.out.println(System.identityHashCode(sh7));
		
		StringBuilder sh5 = new StringBuilder("Rengan");
		System.out.println(System.identityHashCode(sh5));
		
		
		sh7 = sh7.append(sh5);
		System.out.println(sh7);
		System.out.println(System.identityHashCode(sh7));
		System.out.println("\n");
		
		// Question 11.4 - Literal String(immutable)
		
		String sh8 ="Nisha";
		String sh10 = "Rengan";
		
		
		System.out.println(System.identityHashCode(sh8));
		System.out.println(System.identityHashCode(sh10));
		sh8 = sh8.concat(sh10);
		System.out.println(sh8);
		System.out.println(System.identityHashCode(sh8));
		System.out.println("\n");
		
		// Question 12.1 - Split it
		String s9 = "Welcome to java class";
		String[] a = s9.split("l");
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
		System.out.println(a[0]);
		
		
		//Question 13.1
		
		String s15 = "Welcome to java class";
		String[] de = s15.split(" ");
		
		System.out.println("The result is\n"+de[2]);
		System.out.println("/n");
		
		//Question 14  : Not sure
		
		// Question 15 : Not sure
		
		//Question 16   : Not sure
		String j = "Welcome";
		String sn = j.replace("e","@");
		System.out.println("Print the result\n"+sn);
		
		
		//substring
		String substring = s15.substring(5);
		System.out.println("\n"+substring);
		
		//substring to start and end with particular index
		String substring2 = s15.substring(5,18);
		System.out.println("\n"+substring2);
		
		
		
		}

	}

