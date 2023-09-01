package stream.api.collection.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {
public static void main(String[] args) {
	
	List<Integer>list=new ArrayList<>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	
	//Filter
//	List<Integer> output=new ArrayList();
//	for (Integer i:list) {
//		if(i%2==0) {
//			System.out.println(i);
//			output.add(i);
//		}
//	}
	
	List<Integer> output1=new ArrayList();
	Iterator<Integer>itr=list.iterator();
	while(itr.hasNext()) {
		Integer i=itr.next();
		if(i%2==0)
		output1.add(i);
	}
	System.out.println(output1); //store and then print
	
	//Stream Api--Collection processing
	
//	Stream<Integer>stream=list.stream();
//	stream.forEach(i->System.out.println(i));
	
	
	
	list.stream().forEach(i->System.out.println(i));  //
	list.stream().forEach(i->{System.out.println(i);});
	
	list.stream().forEach(System.out::println);
	
}
}
