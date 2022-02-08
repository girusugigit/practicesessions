package ses.java;

public class Array {
 public static void main(String[] args) {
	int a[] = new int[6];
	
	a[0]= 10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	a[4]=50;
	a[5]=60;
	
	for (int i  = 0; i  < a.length; i ++) {
		System.out.println(a[i]);
		System.out.println();
	}
		//particular value
		System.out.println(a[4]);
		System.out.println();
		
		//enhanced loop
		for(int j:a) {
			System.out.println(j);
		}
			int l =a.length;
			System.out.println("\n"+l);
			System.out.println();
			
			System.out.println("check thisssssss");
			String g = "I love java";
			String[] a12 = g.split(" ");
			
			
			for (int i = 0; i < a12.length; i++) {
				System.out.println("value of a12 \n"+a12[i]);
				
				
				String g1 = "I love java";
				String[] a13 = g1.split("a");
				
				for (int k = 0; k < a13.length; k++) {
					System.out.println("Value of a13 \n"+a13[k]);
			}
			
		}
 }}


