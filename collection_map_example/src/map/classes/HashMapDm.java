package map.classes;

import java.util.HashMap;

public class HashMapDm {
	public static void main(String[] args) {
		
		HashMap<Integer, String>map=new HashMap<>();    //not full DNSO  NATURAL SORTING 
		map.put(11, "mahesh");
		map.put(12, "sushant");
		map.put(13, "nana");
		String v1=map.put(12, "riya");
		String v2=map.put(15, "nana");
		System.out.println(v1);         //sushant
		System.out.println(v2);  //null
		System.out.println("<<<<<<<<<<<<<<<<");
		System.out.println(map);    // {11=mahesh, 12=riya, 13=nana, 15=nana}
		System.out.println(map.size());  //4
		
		String v3=map.get(12);
		System.out.println(v3);  //riya
		
		String v4=map.get(18);
		System.out.println(v4);  //null
	}

}
