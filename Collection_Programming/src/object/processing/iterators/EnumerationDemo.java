package object.processing.iterators;


import java.util.*;
import java.util.Vector;

public class EnumerationDemo {
	
	public static void main(String[] args) {
     Vector<Integer>v=new Vector<>();
		for(int i=0;i<=100;i=i+6) {
			v.add(i);  //autoboxing arr.add(Integer.valueof(i));
			
		}
		
		Enumeration<Integer>e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
	}

}
