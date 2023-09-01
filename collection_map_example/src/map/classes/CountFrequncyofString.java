package map.classes;

import java.util.HashMap;

public class CountFrequncyofString {
public static void main(String[] args) {
	

	String []arr= {"AA","BB","AA","CC","A","CC"};
	HashMap<String, Integer>map=new HashMap<>();
	
	for(String str:arr) {
		if(map.containsKey(str)) {
			Integer v=map.get(str);
			v++;
			map.put(str, v);
		}else {
			map.put(str, 1);
		}
	}
	System.out.println(map);
}
}