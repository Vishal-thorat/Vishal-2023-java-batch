package map.classes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapExample {
	public static void main(String[] args) {

		// HashMap<String,Integer>map=new HashMap<>();
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

		map.put("Help", 6546532);
		map.put("fine", 13313);
		map.put("hi", 877998);
		map.put("see", 5646654);

		Set<String> s = map.keySet();

		Iterator<String> itr = s.iterator();
		while (itr.hasNext()) {
			String key = itr.next();
			Integer value = map.get(key);
			System.out.println(key + " = " + value);

		}
	}
}
