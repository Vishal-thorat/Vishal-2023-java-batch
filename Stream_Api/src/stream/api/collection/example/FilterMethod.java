package stream.api.collection.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMethod {
public static void main(String[] args) {
	//Even prinitng and display
	 List<Integer>list =Arrays.asList(10,20,30,40,50,60,70,80,90);  //fast to create list
	 
	 //here we just we printed result not stored
	 list.stream().filter(i->i%2==0).forEach(System.out ::println);
	 
	List<Integer>list1= list.stream().filter(i->i%2==0).collect(Collectors.toList());  //list return by collectors
	 System.out.println(list1);
}
}
