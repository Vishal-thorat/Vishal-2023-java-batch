package stream.api.collection.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class NonterminalMethod {
public static void main(String[] args) {
	
	List<Employee>list=Arrays.asList(
			new Employee(1,"A",25000.10),
			new Employee(2,"B",35000.10),
			new Employee(1,"C",25000.10),
			new Employee(3,"D",9000.10),
			new Employee(4,"E",2500.10),
			new Employee(6,"F",1000.10)
			);
	
	List<Integer>nums =Arrays.asList(23,45,23,4,5,6,7,8,98,8,1,2,5,6,8,1);
	
	nums.stream().distinct().forEach(System.out::println);
	
//	list.stream().distinct().forEach(System.out::println);
	
	
	
	
	//limit
	 List<Integer>list2=nums.stream().limit(4).collect(Collectors.toList()) ;
	 System.out.println(list2);
	
	 
	 //one list 4 start char wants
	 
//	 List<String>names=Arrays.asList("Vishal","Samir","Saurabh","Ganesh");
//	 List<String>namesUpdated=  names.stream().map(str->str.substring(0,4)).collect(Collectors.toList());
//	System.out.println(namesUpdated);
	
	
	 
	 //on that apply limit
	 
	 List<String>names=Arrays.asList("Vishal","Samir","Saurabh","Ganesh");
	 List<String>namesUpdated=  names.stream().limit(2). map(str->str.substring(0,4)).collect(Collectors.toList());
	System.out.println(namesUpdated);
	
	
	
	//Terminal    ---  count , min max
	
	List<Integer>numberss =Arrays.asList(23,45,23,4,5,6,7,8,98,8,1,2,5,6,4,5,78,1,8,1);
	
	long length =numberss.stream().count();
	System.out.println(length);
	
  Optional<Integer>min=numbers.stream().min(e1,e2)->e1.compareTo(e2));
	
   System.out.println(min.get());
   
   
   
   Optional<Integer>max=numberss.stream().max(e1,e2)->e1.compareTo(e2));
	
   System.out.println(max.get());
   
   
	
	
}
}
