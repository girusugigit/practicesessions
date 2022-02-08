package ses.java;
import java.util.Scanner;

public class ScannerTask {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	
	System.out.println("Enter the age");
	s.nextByte();
	
	System.out.println("Enter pin number");
	s.nextShort();
	
	System.out.println("Enter register number");
	s.nextInt();
	
	System.out.println("Enter the phone number");
	s.nextLong();
	
	System.out.println("Enter the average mark");
	s.nextDouble();
	
	System.out.println("Enter the gender");
	s.next().charAt(0);
	
	System.out.println("Enter the name");
	s.next();
	
	System.out.println("Enter the salary");
	s.nextDouble();
			
}
}
