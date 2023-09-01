package array_vs_Collection_Api;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class ListDemo {
public static void main(String[] args) {
	
//	ArrayList<Integer>al=new ArrayList<>();
//	List<Integer>al1=new ArrayList<>();  Best of all
//	Collection<Integer>al2=new ArrayList<>();
	
	
	List<Integer>arr=new ArrayList<>();  //linkedlist ,vector,stack  --follow list principl
	arr.add(100);
	arr.add(null);
    arr.add(200);
	arr.add(300);
	arr.add(null);
	arr.add(400);
	arr.add(500);
	
	System.out.println(arr);
}
}
