package stream.api.collection.example;

import java.util.List;
import java.util.Optional;

public class MinAndMax {
public static void main(String[] args) {
	
	//TRY TO SOLVED THIS 
	
	
	//Terminal    ---  count , min max
	
		List<Integer>na =Arrays.asList(23,45,23,42,5,6,4,5,78,1,8,1);
		
		long length =na.stream().count();
		System.out.println(length);
		
	  Optional<Integer>min=na.stream().min(e1,e2)->e1.compareTo(e2));
		
	   System.out.println(min.get());
	   
	   
	   
	   Optional<Integer>max=na.stream().max(e1,e2)->e1.compareTo(e2));
		
	   System.out.println(max.get());
}
}
