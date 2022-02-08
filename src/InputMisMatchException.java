import java.util.Scanner;

import com.cal.task.CalTask;

public class InputMisMatchException extends CalTask {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter reg no");
	int ne = s.nextInt();
	System.out.println("emp reg number is"+ne);
	age();
}
}
