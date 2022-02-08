package ses.java;
import java.util.Scanner;
import ses.java.CalculateMarks;
public class StudentsMark {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter Mark 1");
	int m1=s.nextInt();
	
	System.out.println("Enter Mark 2");
	int m2=s.nextInt();
	
	System.out.println("Enter Mark 3");
	int m3=s.nextInt();
	
	System.out.println("Enter Mark 4");
	int m4=s.nextInt();
	
	System.out.println("Enter Mark 5");
	int m5=s.nextInt();
	
	CalculateMarks cm=new CalculateMarks();
	cm.add(m1, m2, m3, m4, m5);
	int total=cm.add(m1, m2, m3, m4, m5);
	System.out.println("The total marks is "+total);
	
	cm.avg(total);
	double avg=cm.avg(total);
	System.out.println("The average mark is "+avg);
	
	
	
	
	
}



}

