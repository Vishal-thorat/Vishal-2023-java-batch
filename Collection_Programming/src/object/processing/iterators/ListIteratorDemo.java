package object.processing.iterators;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorDemo {
public static void main(String[] args) {
	
	ArrayList<Integer>al=new ArrayList<>();
	Iterator<Integer>itr=al.iterator();
	
	ListIterator<Integer>itr1=al.listIterator();
	
	while(itr1.hasNext()) {
		Integer i=itr1.next();
		itr1.remove();
	}
	
	

}



















//HashSet<Integer>sh=new HashSet<>();   no listiterator method this is not universal
//Iterator<Integer>itr1=sh.iterator();  
}
