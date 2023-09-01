package grouping.stream.api.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByExample {
@SuppressWarnings("unchecked")
public static void main(String[] args) {
	
	List<Person>list =new ArrayList<>();
	list.add(new Person ("Sudama",Gender.MALE,23));
	list.add(new Person ("Mahesh",Gender.MALE,45));
	list.add(new Person ("Radhika",Gender.FEMALE,32));
	list.add(new Person ("Madhura",Gender.FEMALE,32));
	list.add(new Person ("damini",Gender.FEMALE,30));
	
	//print female and male name and age print or stored
	
	Map<Gender, List<Person>>map=new HashMap<>();
	
	for(Person person:list) {
		if(map.containsKey(person.getGender())) {
			List<Person>l=map.get(person.getGender());	
			l.add(person);
			map.put(person.getGender(),l);
		}else {
			List<Person>l=new ArrayList<>();
			l.add(person);
			map.put(person.getGender(),l);
		}
	}
	
//	map.keySet().stream().forEach(i->{
//		System.out.println(map.get(i));       //(i +"  "+map.get(i));
//		});
	
	//now above problem solved by using stream api
	//list to map
	Map<Gender, List<Person>>map1=list.stream().collect(Collectors.groupingBy(i->i.getGender(),Collectors.toList()));
	
	map1.keySet().stream().forEach(i->{
		System.out.println(map.get(i));       //(i +"  "+map.get(i));
		});
	
	
	//count  -how many male 0r female pressent
Map<Gender, Long>map2=list.stream().collect(Collectors.groupingBy(i->i.getGender(),Collectors.counting()));
	
	map2.keySet().stream().forEach(i->{
		System.out.println(map.get(i));       //(i +"  "+map.get(i));
		});
	
	System.out.println(map2);
	
	
	
	//frequency count
	
	List<Integer>nums=Arrays.asList(1,2,0,3,4,5,58,8,8,8,1,2,1,2,3,5,4,5,4,558,25,12);
	
	Map<Integer, Long>map4=nums.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));
	System.out.println(map4);
	
	
	
}
}
