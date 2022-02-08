package ses.java;

public class DemoTask {

	public static void main(String[] args) {
		byte b = 9;
		System.out.println("My daughter age is\t" + b);

		short s = 5826;
		System.out.println("The Pinnumber to open the lock is\t" + s);

		int i = 586793259;// when tried more than 9 in "int" got the error message Exception in thread
							// "main" java.lang.Error: Unresolved compilation problem:
		// The literal 5867932598 of type int is out of range
		System.out.println("The register number is\t" + i);

		long l = 8607907280l;// when tried to give without l got the error message as Exception in thread
								// "main" java.lang.Error: Unresolved compilation problem:
		// The literal 8607907280 of type int is out of range
		System.out.println("My mobile number is\t" + l);

		float f = 88.90f;// when tried without f got the error message Exception in thread "main"
							// java.lang.Error: Unresolved compilation problem:
		// Type mismatch: cannot convert from double to float

		System.out.println("My daughter scored\t" + f);
		
		double d=200000.92;
		System.out.println("My monthly salary is\t"+d);
		
		char G='F';
		System.out.println("I filled the form under gender as "+G);
		
		String k="it is raining";
		System.out.println(k+"\tin kanyakumari");
		
		boolean bo=true;
		System.out.println("He showed his " +bo +" color");
				
	}
}
