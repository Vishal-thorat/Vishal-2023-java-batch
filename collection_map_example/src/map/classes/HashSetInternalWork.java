package map.classes;

import java.util.HashSet;

public class HashSetInternalWork {
public static void main(String[] args) {
	
	//tell me about internal working of hashset  /// Interview Question
	
	HashSet<String>set=new HashSet<>();
	
	boolean b=set.add("A");
	System.out.println(b);  //true

	boolean b1=set.add("A");
	System.out.println(b1);  //false
	
}
}
