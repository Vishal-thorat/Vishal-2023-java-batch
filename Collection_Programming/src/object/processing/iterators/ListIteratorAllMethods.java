package object.processing.iterators;

import java.util.*;

public class ListIteratorAllMethods {
public static void main(String[] args) {
	ArrayList<Integer>arr=new ArrayList<>();
	for(int i=0;i<=100;i=i+6) {
		arr.add(i);  //autoboxing arr.add(Integer.valueof(i));
		
	}

	ListIterator<Integer>listItr=arr.listIterator();
	
//	listItr.next();
//    listItr.next();
//	System.out.println(listItr.hasNext());
//	System.out.println(listItr.nextIndex());
//	System.out.println(listItr.hasPrevious());
//	System.out.println(listItr.previousIndex());
	
	
//	while(listItr.hasNext()) {
//		System.out.println(listItr.next());
//	}
//	
//	while(listItr.hasPrevious()) {
//		System.out.println(listItr.previous());
//	}
//	
//	System.out.println(arr);
//	while(listItr.hasNext()) {
//		Integer ele=listItr.next();
//		if(ele % 9 == 0) {
//			listItr.remove();
//			}
//		
//	}
//	System.out.println(arr);
//	
	
	
	System.out.println(arr);
	while(listItr.hasNext()) {
		Integer ele=listItr.next();
		if(ele % 9 == 0) {
			listItr.set(ele+1);
			}
		
	}
	System.out.println(arr);
	
	
}
}
