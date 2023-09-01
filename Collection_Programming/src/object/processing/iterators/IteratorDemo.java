package object.processing.iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		
		ArrayList<Integer>al=new ArrayList<>();
		
		al.add(100);al.add(200); al.add(300); al.add(400); al.add(500);
		
		Iterator<Integer>itr=al.iterator();
		
		//with the help of while loop
		while(itr.hasNext()) {
			Integer i=itr.next();
			System.out.println(i);
		}
		//System.out.println(itr.next());  //exception java.util.NoSuchElementException
		
		//remove 400 from given collection
		
		Iterator<Integer>itr1=al.iterator();
		while(itr1.hasNext()) {
			Integer i=itr1.next();
			if(i.equals(400)) {
				itr1.remove();
			}
			
			}System.out.println(al);
	}

}