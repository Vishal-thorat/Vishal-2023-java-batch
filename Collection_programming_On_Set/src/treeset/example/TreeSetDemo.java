package treeset.example;

import java.util.TreeSet;

public class TreeSetDemo {
 public static void main(String[] args) {
	TreeSet<Integer> t=new TreeSet<>();    //TreeSet t=new TreeSet();
	t.add(100);          //duplicate t.add(100);
	t.add(10000);
	t.add(1000);
	t.add(1);                   // t.add(null);
	t.add(1000000);
	t.add(10);
	
	System.out.println(t);
	
	//number  >>natural sorting order >>ascending order   //1,10,100,1000,10000
	
	TreeSet<String> set =new TreeSet<>();
	
	set.add("Z");
	set.add("B");
	set.add("A");
	set.add("a");
	set.add("L");
	
	System.out.println(set);  //[A, B, L, Z, a]
}
}
