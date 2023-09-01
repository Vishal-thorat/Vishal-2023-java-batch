package reduce.stream.api.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(1,2,3,4,9,8,7,6,5);
	
	//sum of elements
	Integer result=list.stream().reduce(0, (sum,i)->sum+i);
	System.out.println(result);
	
	//even number sum or odd number sum
	Integer result1=list.stream().filter(i->i%2==0).reduce(0, (sum,i)->sum+i);
	System.out.println(result1);
	
	//product of all elements
	
	Integer result2=list.stream().reduce(1, (sum,i)->sum*i);
	System.out.println(result2);
	
	//without init value
	
	Optional<Integer> result3=list.stream().reduce( (sum,i)->sum*i);
	System.out.println(result3.get());
	
	//Max and min find 
	List<Integer> list1=Arrays.asList(1,2,3,4,32,58,89,8,7,6,5);
	
	//min
   Optional<Integer>min=list1.stream().min(e1,e2)-> e1.compareTo(e2));
   System.out.println(min.get());
   
	//max
   Optional<Integer>max=list1.stream().max(e1,e2)-> e1.compareTo(e2));
   System.out.println(max.get());
   
   
   Optional<Integer>min1=  list1.stream().reduce(e1,e2)->{
	   if(e1<e2) {
		   return e1;
	   }else {
		   return e2;
	   }
   });
   System.out.println(min1.get());
   
   
   //using ternary opertor
   Optional<Integer>min1=  list1.stream().reduce(e1,e2)->e1<e2?e1:e2);
	  System.out.println(min1.get());
   
	  //aassignment odd number addition  //do sum of add number and( double it)
	  
	  List<Integer> list10=Arrays.asList(2,3,7,4,9);
 Optional<Integer> re= list10.stream().filter(i->i%2==1).map(i->i*2).reduce(sum,i2)->sum+i2);
   System.out.println(re.get());
   
   without map
   
   Integer re1= list10.stream().filter(i->i%2==1).reduce(0,(sum,i2)->sum+i2*2);
   System.out.println(re1);
}
}
