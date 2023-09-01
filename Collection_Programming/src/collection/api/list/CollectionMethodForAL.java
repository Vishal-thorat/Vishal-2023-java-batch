package collection.api.list;

import java.util.*;

public class CollectionMethodForAL {
public static void main(String[] args) {
	ArrayList al=new ArrayList();    //tostring already override
	
	Boolean b=al.add("String");
	Boolean b1=al.contains("String");
	al.add(100);
	al.add(200);
	al.add(new Thread());
	al.add(100);
	
	//int i=al.size(); //6
	
	Vector v=new Vector();
	v.add(99); v.add(98);
	v.addAll(v);
	
	int i=al.size();
	System.out.println(i);
	
}
}
