package collection.api.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionMethods {
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		//boolean b add(object){}
		boolean b=al.add("Hi");
		//System.out.println(b);  //true
		
		//boolean b=addAll(Collection){}
		LinkedList ll=new LinkedList();
		ll.add("ll1");
		ll.add("ll2");
		ll.add("ll3");
		
		al.addAll(ll);
		
		System.out.println(al);
		System.out.println(al.size());
		
		boolean b1=al.add("Hi");
	     System.out.println(b1);
	     
	     System.out.println(al);
		 System.out.println(al.size());
		 System.out.println(">>>>>>>>>>>>>>>---->>>>>>>>");
		 al.removeAll(ll);
		 System.out.println(al);
		 System.out.println(al.size());
		 System.out.println("is array list empty " +al.isEmpty());
		 
		 al.add("Hello");
		 al.add(100);
		 al.add(200);
		 System.out.println(al);
		 System.out.println(al.size());
		 
		 System.out.println("is 100 present inside list " +al.contains(100));
		 al.removeAll(ll);
		 System.out.println("is array list empty " +al.isEmpty());
		
	}

}
