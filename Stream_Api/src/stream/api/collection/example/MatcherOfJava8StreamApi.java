package stream.api.collection.example;

import java.util.Arrays;
import java.util.List;

public class MatcherOfJava8StreamApi {
public static void main(String[] args) {
	
	List<Integer>list=Arrays.asList(10,20,30,40,50,60);
	 //anyMatch --terminal operation
	
	boolean isExist=list.stream().anyMatch(i->i.equals(50));    //anyMatch
	System.out.println(isExist);
	
	//all Match  ---if all matches found then only true else false
	
	List<String>list2=Arrays.asList("abc","abc","abc","abc");
	boolean status =list2.stream().allMatch(i->i.equals("abc"));
	System.out.println(status);
	
	
	//noneMatch --if no  match found then true else false
	
	List<String>list3=Arrays.asList("abc","abc","abc","abc");
	boolean status1 =list3.stream().noneMatch(i->i.equals("abc"));
	System.out.println(status1);
	
	
	//toArray -- I am converting collection object into Array
	
	Object[] arr = list2.stream().toArray();
	
	List<Object>newList =Arrays.asList(arr);
	
	
	
	
}
}
