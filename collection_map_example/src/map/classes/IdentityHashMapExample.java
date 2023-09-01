package map.classes;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapExample {
public static void main(String[] args) {
	
//	HashMap<String,Integer>map=new HashMap<>();
//	//data same  and overridden done
//	String s1=new String ("Vishal");
//	String s2=new String ("Vishal");
//	
//	map.put(s1, 1010);  
//	map.put(s2, 78899);
//	
//	System.out.println(map); {Vishal=78899}
	
	
	//identtiy hashmap
	
	IdentityHashMap<String,Integer>map=new IdentityHashMap<>();
	//data same  and overridden done
	String s1=new String ("Vishal");  // scp string constant pool    String s1="vishal";
	String s2=new String ("Vishal");   //object class ki equal method dekhata hai s1==s2 hai kya --false
	
	
	map.put(s1, 1010);  
	map.put(s2, 78899);
	
	System.out.println(map);
}
}
