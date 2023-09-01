package comparator_custom_sorting;

import java.util.Comparator;
import java.util.TreeSet;

public class SortStringByLength {
  public static void main(String[] args) {
	
	  TreeSet<String> t=new TreeSet<>(new MyOwnSorting());
	  t.add("sfasgds");
	  t.add("dgfdhhgds");
	  t.add("liulls");
	  t.add("weaweds");
	  t.add("mmbngds");
	  System.out.println(t);
	  
	  
	  for (String str : t) {
		System.out.println(str);
	}
}
}

class MyOwnSorting implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
//		if(o1.length() >o2.length()) {
//			return -1;
//		}
//		else if(o1.length() <o2.length()) {
//			return +1;
//		}else
//		{
//			return o1.compareTo(o2);
//		}
		
		return 1;
	}
	
	
}