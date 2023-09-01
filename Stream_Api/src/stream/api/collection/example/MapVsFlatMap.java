package stream.api.collection.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
public static void main(String[] args) {
	
	List<Integer>list=Arrays.asList(10,20,30,40,50,60);
	
	List<Integer>set	=list.stream().map(i->i*i).collect(Collectors.toList());
	System.out.println(set);
	
	
	//flatmap
	
//	List<List<Integer>>list1=new ArrayList<>();
//	
//	List<Integer>l1=new ArrayList<>();
//	l1.add(10);l1.add(20);
//	
//	list1.add(l1);
	
	//this line return in below
//	List<Integer>l1= Arrays.asList(10,20,30,40,50);
// 	List<Integer>l2=Arrays.asList(40,50,60,70);
// 	List<Integer>l3= Arrays.asList(70,90,10);
//	List<List<Integer>>list1= Arrays.asList(l1,l2,l3);
	
	List<List<Integer>>list1= Arrays.asList(
			Arrays.asList(10,20,30,40,50),
			Arrays.asList(40,50,60,70),
			Arrays.asList(70,90,10)
			);
	
	System.out.println(list1);
	
	// Using normal foreach loop
	
	List<Integer>output=new ArrayList<>();
	
	for (List<Integer>l : list1) {
		for(Integer i:l) {
			output.add(i);
		}
	}
	System.out.println(output);
	
	
	List<Integer>data = list1.stream().flatMap(i->i.stream()).collect(Collectors.toList());
	System.out.println(data);
	
	
}
}
