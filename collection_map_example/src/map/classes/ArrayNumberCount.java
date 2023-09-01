package map.classes;

import java.util.HashMap;


public class ArrayNumberCount {
public static void main(String[] args) {
	
	Integer[] num= {10,10,10,1,2,1,3,4,1,2,5,7,8,5,5};
	
	HashMap<Integer,Integer>map=new HashMap<>();  //size 0 capacity 16
	map.put(2,100);
	
//	boolean b=map.containsKey(2);
//	System.out.println(b);
//	
//	boolean b1=map.containsKey(20);
//	System.out.println(b1);
	
	//itr {10 =1}
	
	for (Integer key : num) {
		
		if(map.containsKey(key)) {
		Integer v=map.get(key)	;
		v++;
		map.put(key, v);
		}else {
			map.put(key, 1);
		}
				
	}
	System.out.println(map);
}
}
