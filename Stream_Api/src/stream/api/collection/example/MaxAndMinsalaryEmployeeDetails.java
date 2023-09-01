package stream.api.collection.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxAndMinsalaryEmployeeDetails {
public static void main(String[] args) {
	
	List<Employee>list=Arrays.asList(
			new Employee(1,"A",25000.10),
			new Employee(2,"B",35000.10),
			new Employee(3,"C",25000.10),
			new Employee(4,"D",9000.10),
			new Employee(5,"E",2500.10),
			new Employee(6,"F",1000.10)
			);
	
	Optional<Employee>e=list.stream().min(e1,e2)->e1.getSalary().compareTo(e2.getSalary()));
	System.out.println(e.get());
	
	Employeee e1=list.stream().max(e1,e2)->e1.getSalary().compareTo(e2.getSalary())).get();
	System.out.println(e1);
	
	
	//treee --Treemap, Treeset
	
	List<Integer>num =Arrays.asList(23,45,23,4,5,6,7,8,98,8,1,2,5,6,4,5,78,1,8,1);
	//natural order  ascending
	List<Integer>num1=nums.stream().sorted.collect(Collectors.toList());
	System.out.println(num1);
	
	
	//descending
	List<Integer>num2=nums.stream().sorted(e1,e2)->e2.compareTo(e1)).collect(Collectors.toList());
	System.out.println(num2);
	
	
	
	//sort employee according to salary
	
	List<Employee>listExp=.stream().sorted(e1,e2)->e2.getSalary().compareTo(e2.getSalary()).collect(Collectors.toList();
	listEmp.forEach(System.out::println);
	
}
}
