package stream.api.collection.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class First {
public static void main(String[] args) {
	
	List<Integer>list=new  ArrayList<Integer>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
//	
//	for (Integer integer : list) {
//		System.out.println(integer);
//	}
	

//	Stream<Integer>obj=list.stream();
//	obj.forEach(i->System.out.println(i));
	
	//one line answer
  // list.stream().forEach(num->System.out.println(num));
	
	list.stream().forEach(System.out ::println);  //using double
	
}
}
