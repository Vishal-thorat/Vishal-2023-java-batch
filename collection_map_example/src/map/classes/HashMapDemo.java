package map.classes;

import java.util.HashMap;

public class HashMapDemo {
public static void main(String[] args) {
	
	HashMap<Integer, String>map=new HashMap<>();
	map.put(11, "Rohit");
	map.put(15, "kiran");
	map.put(12, "Mohit");
	
	System.out.println(map);
	
	System.out.println("<<<<<<<<<<<<<<<<");
	
	String v=map.put(13, "Ganesh");
	String v1=map.put(12, "saurabh");  //override to mohit by saurabh
	System.out.println(map);
}
}
