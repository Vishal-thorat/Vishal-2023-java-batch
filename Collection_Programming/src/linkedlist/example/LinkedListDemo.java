package linkedlist.example;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		
		LinkedList<String> ll=new  LinkedList<>();
		ll.add("A");
		ll.add("B");
		ll.add(null);
		ll.add("C");
		ll.add("D");
		System.out.println(ll.toString());  //[A, B, null, C, D]

		
		System.out.println(ll.contains("C")); //true
		System.out.println(ll.remove(0));  //"A"
		System.out.println(ll.size());   //4
		System.out.println(ll.toString()); //[B, null, C, D]

		
		
	}

}
