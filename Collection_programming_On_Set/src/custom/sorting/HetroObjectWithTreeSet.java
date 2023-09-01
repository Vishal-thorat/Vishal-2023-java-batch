package custom.sorting;

import java.util.Comparator;
import java.util.TreeSet;

public class HetroObjectWithTreeSet {
public static void main(String[] args) {
	
	TreeSet<Object>tree=new TreeSet<>(new HetroObjects());
	
	tree.add("adhdkf");
	tree.add(new StringBuffer("utrkf"));
	tree.add(new StringBuffer("wiyodkf"));
	System.out.println(tree);
}
}

class HetroObjects implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		
		return s1.compareTo(s2);
	}
	
}