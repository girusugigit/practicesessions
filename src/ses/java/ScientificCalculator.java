package ses.java;

public class ScientificCalculator extends NormalCalculator {
private double tan(int num1, int num2) {
	NormalCalculator nc=new NormalCalculator();
	nc.add();
	System.out.println("Enter the Tan value");
	return Math.sin(num1);

}
public static void main(String[] args) {
	ScientificCalculator sc=new ScientificCalculator();
	double tan = sc.tan(1,2);
	sc.add();	
	System.out.println(" the Sin value is "+tan);
	
	
}

}
