package ses.java;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class SampleMap {
public static void main(String[] args) {
	Map<Integer,String> m = new LinkedHashMap<>();
	 m.put(10,"Java");
	 m.put(20,"sel");
	 m.put(30,"test");
	 m.put(40,"ng");
	 m.put(50,"maven");
	 
	 System.out.println(m);
	 
	 Set<Integer> s1= m.keySet();
	 System.out.println(s1);
	 
	 for (Integer i : s1) {
		System.out.println(i);
	}
	 Collection<String> c = m.values();
	 System.out.println(c);
	 
	 for (String string : c) {
		System.out.println(string);
	}
}
}
