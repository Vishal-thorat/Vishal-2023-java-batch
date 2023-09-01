package collection.api.list;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListDemo {
public static void main(String[] args) {
	
	//here we are going see arraylist class Example demo
	
//	Collection c=new ArrayList();
//	List list =new ArrayList();

	ArrayList al=new ArrayList();
	al.add(10);   //10 primitive >> autoboxing  >> Integer object
	al.add("Vishal");     //string class object
	al.add(new Integer(100));
	
	Student s=new Student();
	al.add(s);
	al.add(new Student());
	al.add(null);
	
	System.out.println(al);  //tostring
	 
	/* 1] Arraylist
	 * insertion order is preserve 
	 * duplicate allow 
	 * diff type object is allow
	 * null object insertion is allow
	 */
	
	
	
}
}
class Student{
	@Override
	public String toString() {
		
		return "Hi";
	}
}


