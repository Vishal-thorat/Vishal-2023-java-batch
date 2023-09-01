package map.classes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class CreateSetOfKeys {

	public static void main(String[] args) {

		// create set of keys
		HashMap<String, Integer> map = new HashMap<>();
		map.put("A", 100);
		map.put("B", 100);
		map.put("C", 100);
		map.put("D", 100);
		System.out.println(map);

		Set<String> set1 = map.keySet();
		System.out.println(set1);

		//

		Collection<Integer> list = map.values();
		System.out.println(list);
	}
}