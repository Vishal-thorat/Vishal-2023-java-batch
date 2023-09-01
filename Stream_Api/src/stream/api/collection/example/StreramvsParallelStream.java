package stream.api.collection.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreramvsParallelStream {
public static void main(String[] args) {
	
   List<Integer>list=Arrays.asList(10,20,30,40,50,60);
   List<Integer>set	=list.stream().map(i->i*i).collect(Collectors.toList());  //sequentially happen
	System.out.println(set);
	
	
	
	  List<Integer>list1=Arrays.asList(10,20,30,40,50,60);
	   List<Integer>set1=list.parallelStream().map(i->i*i).collect(Collectors.toList());  //sequentially happen     .stream().parallel().
		System.out.println(set1);
}
}
