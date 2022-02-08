package ses.java;

//import java.security.KeyStore.Entry;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EntrySetMap {
	public static void main(String[] args) {
		Map<Integer, String> m1 = new LinkedHashMap<>();
		m1.put(10, "Java");
		m1.put(20, "SQL");
		m1.put(30, "Selenium");
		m1.put(40, null);
		m1.put(50, "selenium");
		m1.put(10, "core");
		m1.put(null, "Java");

		System.out.println(m1);
		Set<Entry<Integer, String>> en = m1.entrySet();
		System.out.println(en);

		System.out.println("Enhanced forloop");
		for (Entry<Integer, String> entry : en) {
			System.out.println(entry);

		}
		System.out.println("Key");
		for (Entry<Integer, String> e : en) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			
		}
	}
}
