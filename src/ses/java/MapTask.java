package ses.java;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.lang.*;

public class MapTask {
	public static void main(String[] args) {

		// Day 9 Q1.1:
		// Create a HashMap with the below key and values
		// key : 10,20,30,40,50,60,10,50,40
		// values : java,sql,oops,Sql,oracle,DB,selenium,psql,Hadoop.
		Map<Integer, String> m = new HashMap<>();

		m.put(10, "java");
		m.put(20, "sql");
		m.put(30, "oops");
		m.put(40, "sql");
		m.put(50, "oracle");
		m.put(60, "DB");
		m.put(10, "selenium");
		m.put(50, "psql");
		m.put(40, "Hadoop");

		System.out.println("The hashmap value is \n" + m);
		System.out.println();
		// Day 9 Q1.2
		// Create a LinkedHashMap with the below key and values
		// key : 10,20,30,40,50,60,10,50,40
		// Values : 10,20,30,40,50,60,10,50,40

		Map<Integer, String> a = new LinkedHashMap<>();
		a.put(10, "10");
		a.put(20, "20");
		a.put(30, "30");
		a.put(40, "40");
		a.put(50, "50");
		a.put(60, "60");
		a.put(10, "10");
		a.put(50, "50");
		a.put(40, "40");

		System.out.println("LinkedHashMap value is \n" + a);
		System.out.println();

		// Day 9 Q1.3
//	Create a TreeHashMap with the below key and values
//    key    : !,@,#,$,%,^,&,*,(,
//    Values : 10,20,30,40,50,60,10,50,40
		Map<String, Integer> tr = new TreeMap<>();
		tr.put("!", 10);
		tr.put("@", 20);
		tr.put("#", 30);
		tr.put("$", 40);
		tr.put("%", 50);
		tr.put("^", 60);
		tr.put("&", 10);
		tr.put("*", 50);
		tr.put("(", 40);

		System.out.println("Tree Hash Map is \n" + tr);
		System.out.println();

		// Day 9 Q1.4
		// Create a HashTable with the below key and values
		// Key : vel,Ganesh,Dinesh,Vengat,subash
		// Values : Selenium,framework,oracle,corejava,jira

		Map<String, String> ht = new HashMap<>();
		ht.put("Vel", "Selenium");
		ht.put("Ganesh", "Framwork");
		ht.put("Dinesh", "Oracle");
		ht.put("Vengat", "CoreJava");
		ht.put("Subash", "Jira");

		System.out.println("Hashtable is as below:\n" + ht);
		System.out.println();

		// Day 9 Q2.1
		// Create a HashMap with the below key and values and get(print) the key only in
		// the map.
		// key : 10,20,30,40,50,60,10,50,40
		// values : java,sql,oops,Sql,oracle,DB,selenium,psql,Hadoop.

		Map<Integer, String> hm = new HashMap<>();
		hm.put(10, "Jav");
		hm.put(20, "Sql");
		hm.put(30, "oops");
		hm.put(40, "sql");
		hm.put(50, "Oracle");
		hm.put(60, "DB");
		hm.put(10, "Selenium");
		hm.put(50, "psql");
		hm.put(40, "hadoop");

		Set<Integer> d = hm.keySet();

		System.out.println("The Key value is :\n" + d);
		System.out.println();
		// Day 9 Q2.2
		// Create a LinkedHashMap with the below key and values and get(print) the key
		// only in the map.
		// key : 10,20,30,40,50,60,10,50,40
		// Values : 10,20,30,40,50,60,10,50,40

		Map<Integer, Integer> lm = new LinkedHashMap<>();
		lm.put(10, 10);
		lm.put(20, 20);
		lm.put(30, 30);
		lm.put(40, 40);
		lm.put(50, 50);
		lm.put(60, 60);
		lm.put(10, 10);
		lm.put(50, 50);
		lm.put(40, 40);

		Set<Integer> g = lm.keySet();
		System.out.println("LinkedHashMap methos Key value is :\n" + g);
		System.out.println();

		// Day 9 Q2.3
		// Create a TreeMap with the below key and values and get(print) the key only in
		// the map.
		// key : !,@,#,$,%,^,&,*,(,
		// Values : 10,20,30,40,50,60,10,50,409

		Map<String, Integer> tm1 = new TreeMap<>();
		tm1.put("!", 10);
		tm1.put("@", 20);
		tm1.put("#", 30);
		tm1.put("$", 40);
		tm1.put("%", 50);
		tm1.put("^", 60);
		tm1.put("&", 10);
		tm1.put("*", 50);
		tm1.put("(", 409);

		Set<String> f = tm1.keySet();
		System.out.println("TreeMap with Key alone:\n" + f);
		System.out.println();

		// Day 9 Q2.4
		// Create a HashTable with the below key and values and get(print) the key only
		// in the map.
		// Key : vel,Ganesh,Dinesh,Vengat,subash
		// Values : Selenium,framework,oracle,corejava,jira

		Map<String, String> ht1 = new HashMap<>();

		ht1.put("Vel", "Selenium");
		ht1.put("Ganesh", "Framwork");
		ht1.put("Dinesh", "Oracle");
		ht1.put("Vengat", "CoreJava");
		ht1.put("Subash", "Jira");

		Set<String> h = ht1.keySet();
		System.out.println("HashMap with the Key only :\n" + h);
		System.out.println();

		// Day 9 Q3.1
		// Create a HashMap with the below key and values and get(print) the values only
		// in the map.
		// key : 10,20,30,40,50,60,10,50,40
		// values : java,sql,oops,Sql,oracle,DB,selenium,psql,Hadoop.

		Map<Integer, String> s = new HashMap<>();
		s.put(10, "Java");
		s.put(20, "sql");
		s.put(30, "oops");
		s.put(40, "sql");
		s.put(50, "oracle");
		s.put(60, "DB");
		s.put(10, "selenium");
		s.put(50, "psql");
		s.put(40, "Hadoop");

		Set<Integer> s1 = s.keySet();
		System.out.println("The HashMap value is as below:\n" + s1);
		System.out.println();

		// Day 9 Q3.2
		// Create a LinkedHashMap with the below key and values and get(print) the
		// values only in the map.
		// key : 10,20,30,40,50,60,10,50,40
		// Values : 10,20,30,40,50,60,10,50,40

		Map<Integer, Integer> dm = new LinkedHashMap<>();
		dm.put(10, 10);
		dm.put(20, 20);
		dm.put(30, 30);
		dm.put(40, 40);
		dm.put(50, 50);
		dm.put(60, 60);
		dm.put(10, 10);
		dm.put(50, 50);
		dm.put(40, 40);

		Set<Integer> dm1 = dm.keySet();
		System.out.println("Linked HashMap with Key only :\n" + dm1);
		System.out.println();

		// Day 9 Q4.1
		// Create a HashMap with the below key and values and iterate it using enhanced
		// for loop.
		// key : 10,20,30,40,50,60,10,50,40
		// values : java,sql,oops,Sql,oracle,DB,selenium,psql,Hadoop.

		Map<Integer, String> l = new HashMap<>();
		l.put(10, "Java");
		l.put(20, "sql");
		l.put(30, "oops");
		l.put(40, "sql");
		l.put(50, "oracle");
		l.put(60, "DB");
		l.put(10, "selenium");
		l.put(50, "psql");
		l.put(40, "Hadoop");
		
		Collection<String> i = l.values();

		System.out.println("Enhanced for loop for the HashMap is:\n");
		for (String l1 : i) {
			System.out.println(l1);
			System.out.println();
		}
		//Day 9 Q4.2
			//Create a LinkedHashMap with the below key and values and iterate it using enhanced for loop.
            //key    : 10,20,30,40,50,60,10,50,40
            //Values : 10,20,30,40,50,60,10,50,40
			
			Map<Integer,Integer> c = new LinkedHashMap<>();
			dm.put(10, 10);
			dm.put(20, 20);
			dm.put(30, 30);
			dm.put(40, 40);
			dm.put(50, 50);
			dm.put(60, 60);
			dm.put(10, 10);
			dm.put(50, 50);
			dm.put(40, 40);
			
			Collection<Integer> x = dm.values();
			System.out.println("LinkedHashMap enhanced for loop:\n");
			for (Integer y : x) {
				System.out.println(y);
				System.out.println();
			}
			
			//Day 9 Q4.3
			//Create a TreeHashMap with the below key and values and iterate it using enhanced for loop.
            //key    : !,@,#,$,%,^,&,*,(,
            //Values : 10,20,30,40,50,60,10,50,409
			
			Map<String,Integer> n = new TreeMap<>();
			n.put("!", 10);
			n.put("@", 20);
			n.put("#", 30);
			n.put("$", 40);
			n.put("%", 50);
			n.put("^", 60);
			n.put("&", 10);
			n.put("*", 50);
			n.put("(", 409);
			
			Collection<Integer> z = n.values();
			System.out.println("TreeMap- enhanced for loop:\n");
			for (Integer in : z) {
				System.out.println(in);
				System.out.println();
			}
			
			//Day 9 Q4.4
			//Create a HashTable with the below key and values and iterate it using enhanced for loop.
            //Key    : vel,Ganesh,Dinesh,Vengat,subash
            //Values : Selenium,framework,oracle,corejava,jira
			
			Map<String,String> b = new HashMap<>();
			b.put("Vel", "Selenium");
			b.put("Ganesh", "Framwork");
			b.put("Dinesh", "Oracle");
			b.put("Vengat", "CoreJava");
			b.put("Subash", "Jira");
			
			Collection<String> g1 = b.values();
			System.out.println("HashMap - enhanced for loop:\n");
			for (String str : g1) {
				System.out.println(str);
				System.out.println();
			}
			//Day 9 : Q5.1
			//Create a HashMap with the below key and values and iterate it using enhanced for loop and get the key and values combination.
            //key    : 10,20,30,40,50,60,10,50,40
            //values : java,sql,oops,Sql,oracle,DB,selenium,psql,Hadoop.
			Map<Integer, String> l3 = new HashMap<>();
			l3.put(10, "Java");
			l3.put(20, "sql");
			l3.put(30, "oops");
			l3.put(40, "sql");
			l3.put(50, "oracle");
			l3.put(60, "DB");
			l3.put(10, "selenium");
			l3.put(50, "psql");
			l3.put(40, "Hadoop");
			
			System.out.println("HashMap enhanced loop mapping:\n");
			Set<Integer>	 b2 = l3.keySet()	;
			
				
				for (Integer b4 : b2) {
					System.out.println(b4);
					System.out.println(l3.get(b4));
					System.out.println();
				}
				
				//Day 9 : Q5.2
				//Create a LinkedHashMap with the below key and values and iterate it using enhanced for loop and get the key and values combination..
	              //key    : 10,20,30,40,50,60,10,50,40
	             // Values : 10,20,30,40,50,60,10,50,40
             Map<Integer,Integer> map = new LinkedHashMap<>();
             map.put(10, 10);
 			map.put(20, 20);
 			map.put(30, 30);
 			map.put(40, 40);
 			map.put(50, 50);
 			map.put(60, 60);
 			map.put(10, 10);
 			map.put(50, 50);
 			map.put(40, 40);
 			
 			System.out.println("LinkedHashMap enhanced loop mapping:\n");
 			
 			Set<Integer> set = map.keySet();
 			for (Integer key : set) {
				System.out.println(key);
				System.out.println(map.get(key));
				System.out.println();
			}
 			
 			//Day 9 : Q5.3
 			//Create a TreeHashMap with the below key and values and iterate it using enhanced for loop and get the key and values combination.
            //key    : !,@,#,$,%,^,&,*,(,
            //Values : 10,20,30,40,50,60,10,50,409
 			
 			Map<String,Integer> map1 = new TreeMap<>();
 			map1.put("!", 10);
 			map1.put("@", 20);
 			map1.put("#", 30);
 			map1.put("$", 40);
 			map1.put("%", 50);
 			map1.put("^", 60);
 			map1.put("&", 10);
 			map1.put("*", 50);
 			map1.put("(", 409);
 			
 			System.out.println("TreeHashMap enhanced loop mapping:\n");
 			Set<String> set1 = map1.keySet();
 			for (String loop : set1) {
				System.out.println(loop);
				System.out.println(map1.get(loop));
			}
 			
 			//Day 9 : Q5.4
 			//Create a HashTable with the below key and values and iterate it using enhanced for loop and get the key and values combination.
            //Key    : vel,Ganesh,Dinesh,Vengat,subash
            //Values : Selenium,framework,oracle,corejava,jira
 			
 			Map<String,String> map5 = new HashMap<>();
 			map5.put("Vel", "Selenium");
			map5.put("Ganesh", "Framwork");
			map5.put("Dinesh", "Oracle");
			map5.put("Vengat", "CoreJava");
			map5.put("Subash", "Jira");
			
			System.out.println("HashMap enhanced loop mapping:\n");
			Set<String> set2 = map5.keySet();
			for (String Loop2 : set2) {
				System.out.println(Loop2);
				System.out.println(map5.get(Loop2));
			}
			
			
 			
			}
		

	}


