package ses.java;

import java.util.Set;
import java.util.*;

public class CollectionsSetTasks {
	public static void main(String[] args) {

		// Day 8:Q1.1 Create a HashSet for the below values
		// Input : List = 10,20,30,40,50,60,70,80,90,10,20
		Set<Integer> a = new HashSet<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		a.add(70);
		a.add(80);
		a.add(90);
		a.add(100);

		System.out.println("Hash List is \n"+a);

		// Day 8 : Q1.2
		// Create a LinkedHashSet for the below values
		// Input : List = 10,20,30,40,50,60,70,80,90,10,20

		Set<Integer> b = new LinkedHashSet<Integer>();
		b.add(10);
		b.add(20);
		b.add(30);
		b.add(40);
		b.add(50);
		b.add(60);
		b.add(70);
		b.add(80);
		b.add(90);
		b.add(10);
		b.add(20);

		System.out.println("Linked Hash List is \n"+b);

		// Day 8 : Q1.3
		// Create a TreeSet for the below values
		// Input : List = 10,20,30,40,50,60,70,80,90,10,20

		Set<Integer> c = new TreeSet<Integer>();
		c.add(10);
		c.add(20);
		c.add(30);
		c.add(40);
		c.add(50);
		c.add(60);
		c.add(70);
		c.add(80);
		c.add(90);
		c.add(10);
		c.add(20);

		System.out.println("Treeset is \n"+c);
		System.out.println();

		// Day 8 : Q2.1
		// Convert the below list in to set(use addAll()) method
		// Input : List = 10,20,30,90,10,10,40,50

		List<Integer> d = new ArrayList<Integer>();
		d.add(10);
		d.add(20);
		d.add(30);
		d.add(90);
		d.add(10);
		d.add(10);
		d.add(40);
		d.add(50);

		System.out.println("List to set\n"+d);
		System.out.println();
		Set<Integer> e = new LinkedHashSet<Integer>();

		e.addAll(d);
		System.out.println("List to set add all\n"+e);
		System.out.println();

		// Day 8: Q 2.2
		// Convert the below list in to set(use addAll()) method
		// Input : List = 105,205,305,405,505,605,705,805,505,605

		List<Integer> h = new ArrayList<>();
		h.add(105);
		h.add(205);
		h.add(305);
		h.add(405);
		h.add(505);
		h.add(605);
		h.add(705);
		h.add(805);
		h.add(505);
		h.add(605);

		System.out.println(h);

		Set<Integer> f = new HashSet<Integer>();
		f.addAll(h);

		System.out.println("List to set add all\n"+f);
		System.out.println();

		// Day 8: Q2.3
		// Convert the below list in to set(use addAll()) method
		// Input : List = 100,200,300,400,500,600,700,100,300,500

		List<Integer> n = new ArrayList<Integer>();
		n.add(100);
		n.add(200);
		n.add(300);
		n.add(400);
		n.add(500);
		n.add(600);
		n.add(700);
		n.add(100);
		n.add(300);
		n.add(500);

		System.out.println(n);

		Set<Integer> m = new LinkedHashSet<Integer>();
		m.addAll(n);
		System.out.println("List to set add all\n"+m);
		System.out.println();

		// Day 8 : Q3.1
		// Get the each value of set by using enhanced for loop
		// Input: List = 105,205,305,405,505,605,705,805

		Set<Integer> v = new LinkedHashSet<Integer>();
		v.add(105);
		v.add(205);
		v.add(305);
		v.add(405);
		v.add(505);
		v.add(605);
		v.add(705);
		v.add(805);

		System.out.println("Enhanced for loop");
		for (Integer in : v) {
			System.out.println(in);

		}
		// Day 8: Q3.2
		// Create a TreeSet and iterate each value in the set by using enhanced for loop
		// Input : List = 10,20,30,40,50,60,70,80,90,10,20

		Set<Integer> z = new TreeSet<Integer>();
		z.add(10);
		z.add(20);
		z.add(30);
		z.add(40);
		z.add(50);
		z.add(60);
		z.add(70);
		z.add(80);
		z.add(90);
		z.add(10);
		z.add(20);

		System.out.println("TressSet Enhanced for loop");

		for (Integer k : z) {
			System.out.println(k);

		}
		// Day 8 : Q3.3
		// Create a HashSet and iterate each value in the set by using enhanced for loop
		// Input : List = 10,20,30,40,50,60,70,80,90,10,20

		Set<Integer> s = new HashSet<Integer>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(60);
		s.add(70);
		s.add(80);
		s.add(90);
		s.add(10);
		s.add(20);
		System.out.println("HashSet Enhanced for loop");

		for (Integer y : s) {
			System.out.println(y);

		}
		// Day 8 : Q4.1
		// Create a new HashSet with values and return the common values
		// Input : List = 10,20,30,90,10,10,40,50
		// Input : List = 30,40,50,60,80
		Set<Integer> g = new HashSet<Integer>();
		g.add(10);
		g.add(20);
		g.add(30);
		g.add(90);
		g.add(10);
		g.add(10);
		g.add(40);
		g.add(50);

		System.out.println(g);

		Set<Integer> p = new HashSet<Integer>();
		p.add(30);
		p.add(40);
		p.add(50);
		p.add(60);
		p.add(80);

		System.out.println(p);

		p.retainAll(g);
		System.out.println(p);
		System.out.println();

//Day 8: Q4.2
//Create a new LinkedHashSet with values and return the common values
//Input : List = 10,20,30,90,10,10,40,50
//Input : List = 10,20,60,50,40,70,80,90

		Set<Integer> r = new LinkedHashSet();
		r.add(10);
		r.add(20);
		r.add(30);
		r.add(90);
		r.add(10);
		r.add(10);
		r.add(40);
		r.add(50);

		System.out.println(r);

		Set<Integer> q = new LinkedHashSet<Integer>();
		q.add(10);
		q.add(20);
		q.add(60);
		q.add(50);
		q.add(40);
		q.add(70);
		q.add(80);
		q.add(90);

		System.out.println(q);

		q.retainAll(r);
		System.out.println(q);
		System.out.println();

//Day 8 : Q 4.3
//Create a new TreeSet with values and return the common values
		// Input : List = 10,20,30,40,50,60,70,80
		// Input : List = 100,200,300,400,500,600,700,8000
		Set<Integer> w = new TreeSet<Integer>();
		w.add(10);
		w.add(10);
		w.add(10);
		w.add(10);
		w.add(10);
		w.add(10);
		w.add(10);
		w.add(10);

		System.out.println(w);

		Set<Integer> u = new TreeSet<Integer>();
		u.add(100);
		u.add(200);
		u.add(300);
		u.add(400);
		u.add(500);
		u.add(600);
		u.add(700);
		u.add(8000);

		u.retainAll(w);
		System.out.println(u);

//Day 8: Q5.1
//Create a new HashSet with values and perform removeAll() function
//Input : List = 10,20,30,90,10,10,40,50
//Input : List = 30,40,50,60,80

		Set<Integer> j = new HashSet<Integer>();
		j.add(10);
		j.add(20);
		j.add(30);
		j.add(90);
		j.add(10);
		j.add(10);
		j.add(40);
		j.add(50);

		System.out.println(j);
		Set<Integer> k = new HashSet<Integer>();
		k.add(30);
		k.add(40);
		k.add(50);
		k.add(60);
		k.add(80);

		k.removeAll(j);
		System.out.println(k);
		System.out.println();

//Day 8 : Q5.2
//Create a new LinkedHashSet with values and perform removeAll() function
//Input : List = 10,20,30,90,10,10,40,50
//Input : List = 10,20,60,50,40,70,80,90

		Set<Integer> l = new LinkedHashSet<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		l.add(50);

		System.out.println(l);

		Set<Integer> s1 = new LinkedHashSet<Integer>();
		s1.add(10);
		s1.add(20);
		s1.add(60);
		s1.add(50);
		s1.add(40);
		s1.add(70);
		s1.add(80);
		s1.add(90);

		s1.removeAll(l);
		System.out.println(s1);
		System.out.println();

//Day 8 : Q5.3
//Create a new TreeSet with values and perform removeAll() function
//Input : List = 10,20,30,40,50,60,70,80
//Input : List = 100,200,300,400,500,600,700,8000

		Set<Integer> a1 = new TreeSet<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		a1.add(60);
		a1.add(70);
		a1.add(80);

		System.out.println(a1);
		Set<Integer> a2 = new TreeSet<Integer>();
		a2.add(100);
		a2.add(200);
		a2.add(300);
		a2.add(400);
		a2.add(500);
		a2.add(600);
		a2.add(700);
		a2.add(8000);

		a2.removeAll(a1);
		System.out.println(a2);
		System.out.println();

	}
}