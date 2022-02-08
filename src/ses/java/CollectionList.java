package ses.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CollectionList {
	public static void main(String[] args) {

		List t = new ArrayList();

		// Q3 remove duplicates
		t.add(10);
		t.add(10);
		t.add(20);
		t.add(50);
		t.add(60);
		t.add(80);
		t.add(60);
		t.add(50);

		t.remove(0);
		t.remove(2);
		t.remove(4);
		// t.remove(t);
		System.out.println(t);

		// Q4.1

		List t1 = new ArrayList();
		t1.add(10);
		t1.add(20);
		t1.add(30);
		t1.add(90);
		t1.add(10);
		t1.add(10);
		t1.add(40);
		t1.add(50);

		System.out.println(t1);
		System.out.println(t1.size());

		// Q4.2-linked list not sure

		List t3 = new LinkedList();
		t3.add(100);
		t3.add(200);
		t3.add(300);
		t3.add(400);
		t3.add(500);
		t3.add(600);
		t3.add(700);

		System.out.println("Linked List is");
		System.out.println(t3);
		System.out.println(t3.size());

		// Q4.3

		List v = new Vector();
		v.add(105);
		v.add(805);
		v.add(405);
		v.add(405);
		v.add(505);
		v.add(605);
		v.add(705);
		v.add(205);

		System.out.println("The vector output is");
		System.out.println(v);
		System.out.println(v.size());

		// Q4.4 Create a new LinkedListlist with values and find the size() of it.
		// Input : List = 100,200,300,400,500,600,700

		List ll = new LinkedList();
		ll.add(100);
		ll.add(200);
		ll.add(300);
		ll.add(700);
		ll.add(500);
		ll.add(600);
		ll.add(400);

		System.out.println("The LinkedListoutout is");
		System.out.println(ll);
		System.out.println();
		ll.size();

		// Q5.1
		List t4 = new ArrayList();
		t4.add(10);
		t4.add(20);
		t4.add(30);
		t4.add(90);

		System.out.println("index is");
		System.out.println(t4.indexOf(10));

		// Q5.2
		// 10,20,30,90,10,10,40,50
		List t5 = new ArrayList();
		t5.add(10);
		t5.add(20);
		t5.add(30);
		t5.add(90);
		t5.add(10);
		t5.add(10);
		t5.add(40);
		t5.add(50);

		System.out.println(t5.lastIndexOf(10));

		// Q5.3
		// 10,20,30,90,10,10,40,50

		List t6 = new ArrayList();
		t6.add(10);
		t6.add(20);
		t6.add(30);
		t6.add(90);
		t6.add(10);
		t6.add(10);
		t6.add(40);
		t6.add(50);

		System.out.println(t6.indexOf(50));

		// Q5.4
		// 10,20,30,90,10,10,40,50

		List t7 = new ArrayList();
		t7.add(10);
		t7.add(20);
		t7.add(30);
		t7.add(90);
		t7.add(10);
		t7.add(10);
		t7.add(40);
		t7.add(50);

		System.out.println(t7.indexOf(90));

		// Q5.5
		// 10,20,30,90,10,10,40,50,10

		List t8 = new ArrayList();
		t8.add(10);
		t8.add(20);
		t8.add(30);
		t8.add(90);
		t8.add(10);
		t8.add(10);
		t8.add(40);
		t8.add(50);
		t8.add(10);

		System.out.println("Each index of 10 is");
		for (int i = 0; i < args.length; i++) {
			String g = args[i];
			System.out.println(g);
			System.out.println("done");

		}

	

		// Q5.6
		// 10,20,30,90,10,10,40,50,10

		List t9 = new ArrayList();
		t9.add(10);
		t9.add(20);
		t9.add(30);
		t9.add(90);
		t9.add(10);
		t9.add(10);
		t9.add(40);
		t9.add(50);
		t9.add(10);

		System.out.println(t9.indexOf(70));

		// Q6.1
		// 10,20,30,40,50,60

		List t10 = new ArrayList();
		t10.add(10);
		t10.add(20);
		t10.add(30);
		t10.add(40);
		t10.add(50);
		t10.add(60);

		System.out.println(t10.get(2));

		// Q6.2
		// 100,200,300,400,500,600,700

		List t11 = new ArrayList();
		t11.add(100);
		t11.add(200);
		t11.add(300);
		t11.add(400);
		t11.add(500);
		t11.add(600);
		t11.add(700);

		System.out.println(t11.get(4));

		// Q6.3
		// 105,205,305,405,505,605,705,805

//     List t12 = new ArrayList();
//     t12.add(105);
//     t12.add(205);
//     t12.add(305);
//     t12.add(405);
//     t12.add(505);
//     t12.add(605);
//     t12.add(705);
//     t12.add(805);

		// System.out.println(t12.get(8));

		// Q6.4 for loop
		// 105,205,305,405,505,605,705,805

		int a[] = new int[8];

		a[0] = 105;
		a[1] = 205;
		a[2] = 305;
		a[3] = 405;
		a[4] = 505;
		a[5] = 605;
		a[6] = 705;
		a[7] = 805;
		for (int i = 0; i <= 7; i++) {
			System.out.println(a[i]);

		}
		// Q6.5 enhancd for loop
		// 105,205,305,405,505,605,705,805
		System.out.println();

		for (int j : a) {
			System.out.println(j);

		}

		System.out.println();
		// Q7.1 Remove
		// 10,20,30,40,50,60

		List h1 = new ArrayList();
		h1.add(10);
		h1.add(20);
		h1.add(30);
		h1.add(40);
		h1.add(50);
		h1.add(60);

		System.out.println(h1.remove(2));
		System.out.println(h1);

		// Q7.2 Remove
		// 10,20,30,90,10,10,40
		List h2 = new ArrayList();
		h2.add(0);
		h2.add(null);
		h2.add(null);
		h2.add(null);
		h2.add(10);
		h2.add(20);
		h2.add(30);
		h2.add(90);
		h2.add(10);
		h2.add(10);
		h2.add(40);

		System.out.println("Remove 10nth index\n" + h2.remove(10));
		System.out.println(h2);

		// Q7.3 Remove
		// 10,20,30,90,10,10,40

		List g1 = new ArrayList();
		g1.add(10);
		g1.add(20);
		g1.add(30);
		g1.add(90);
		g1.add(10);
		g1.add(10);
		g1.add(40);

		System.out.println(g1.remove(5));
		System.out.println(g1);
		System.out.println();

		// Q8.1 Adding
		// 10,20,30,90,10,10,40,50
		List j1 = new ArrayList();
		j1.add(10);
		j1.add(20);
		j1.add(30);
		j1.add(90);
		j1.add(90);
		j1.add(10);
		j1.add(10);
		j1.add(40);
		j1.add(50);

		j1.add(2, 50);
		System.out.println(j1);
		System.out.println();

		// Q8.2 adding
		// 10,20,30,90,10,10,40,50

		List k1 = new ArrayList();
		k1.add(10);
		k1.add(20);
		k1.add(30);
		k1.add(90);
		k1.add(10);
		k1.add(10);
		k1.add(40);
		k1.add(50);

		k1.add(70);
		System.out.println(k1);
		System.out.println();

		// Q8.3 add
		// 10,20,30,90,10,10,40,50

		List l1 = new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(90);
		l1.add(10);
		l1.add(10);
		l1.add(40);
		l1.add(50);

		l1.add(8, 80);
		System.out.println(l1);

		// Q8.4 add - error hence added null value inbetween
		// 10,20,30,90,10,10,40,50

		List k11 = new ArrayList();
		k11.add(10);
		k11.add(20);
		k11.add(30);
		k11.add(90);
		k11.add(10);
		k11.add(10);
		k11.add(40);
		k11.add(50);
		k11.add(null);
		k11.add(null);

		k11.add(10, 100);
		System.out.println(k11);
		System.out.println();

		// Q9.1 replace
		// 100,200,300,400,500,600,700

		List n11 = new ArrayList();
		n11.add(100);
		n11.add(200);
		n11.add(300);
		n11.add(400);
		n11.add(500);
		n11.add(600);
		n11.add(700);

		n11.set(2, 350);
		System.out.println(n11);
		System.out.println();

		// Q9.2 replace
		// 10,20,30,90,10,10,40,50,10

		List m1 = new ArrayList();
		m1.add(10);
		m1.add(20);
		m1.add(30);
		m1.add(90);
		m1.add(10);
		m1.add(10);
		m1.add(40);
		m1.add(50);
		m1.add(10);

		m1.set(7, 90);
		System.out.println(m1);
		System.out.println();

		// Q9.3 replace - not sure
		// 10,20,30,90,10,10,40,50,30

		// Q4.2 Linked List
		// 100,200,300,400,500,600,700

		List x = new LinkedList();
		x.add(100);
		x.add(200);
		x.add(300);
		x.add(400);
		x.add(500);
		x.add(600);
		x.add(700);

		int y = x.size();
		System.out.println(y);
		System.out.println();
		// Q4.3 vector list
		// 105,205,305,405,505,605,705,805

		List<Integer> g = new Vector<Integer>();

		g.add(105);
		g.add(205);
		g.add(305);
		g.add(405);
		g.add(505);
		g.add(605);
		g.add(705);
		g.add(805);

		int d = g.size();
		System.out.println(d);

		// Q9.3 Replace
		// 10,20,30,90,10,10,40,50,30

		List v1 = new ArrayList();
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(90);
		v1.add(10);
		v1.add(10);
		v1.add(40);
		v1.add(50);
		v1.add(30);

		v1.set(0, 100);
		v1.set(4, 100);
		v1.set(5, 100);

		System.out.println(v1);

		// Q10.1 Common
		// 10,20,30,90,10,10,40,50
		// 30,40,50,60,80

		List m2 = new ArrayList();
		m2.add(10);
		m2.add(20);
		m2.add(30);
		m2.add(90);
		m2.add(10);
		m2.add(10);
		m2.add(40);
		m2.add(50);

		List m3 = new ArrayList();
		m3.add(30);
		m3.add(40);
		m3.add(50);
		m3.add(60);
		m3.add(80);

		// display common values
		m3.retainAll(m2);
		System.out.println(m3);

		// Q10.2 common values
		// 10,20,30,90,10,10,40,50
		// put : List = 10,20,60,50,40,70,80,90

		List b7 = new ArrayList();
		b7.add(10);
		b7.add(20);
		b7.add(30);
		b7.add(90);
		b7.add(10);
		b7.add(10);
		b7.add(40);
		b7.add(50);

		List b8 = new ArrayList();
		b8.add(10);
		b8.add(20);
		b8.add(60);
		b8.add(50);
		b8.add(40);
		b8.add(70);
		b8.add(80);
		b8.add(90);

		b8.retainAll(b7);
		System.out.println(b8);
		System.out.println();

		// Q10..3 common
		// 10,20,30,40,50,60,70,80
		// Input : List = 100,200,300,400,500,600,700,8000

		List g3 = new ArrayList();
		g3.add(10);
		g3.add(20);
		g3.add(30);
		g3.add(40);
		g3.add(50);
		g3.add(60);
		g3.add(70);
		g3.add(80);

		List g5 = new ArrayList();
		g5.add(100);
		g5.add(200);
		g5.add(300);
		g5.add(400);
		g5.add(500);
		g5.add(600);
		g5.add(700);
		g5.add(8000);

		g5.retainAll(g3);
		System.out.println(g5);

	}

}
