package stream.api.collection.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class Student{
private	String name;
private	Integer percentage;
	
	public Student() {}

	public Student(String name, Integer percentage) {
		super();
		this.name = name;
		this.percentage = percentage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPercentage() {
		return percentage;
	}

	public void setPercentage(Integer percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", percentage=" + percentage + "]";
	}
	
	
}

public class FilterMethod1 {
public static void main(String[] args) {
	//Even prinitng and display
	 List<Integer>list =Arrays.asList(10,20,30,40,50,60,70,80,90);  //fast to create list
	 
	 //here we just we printed result not stored
	 list.stream().filter(i->i%2==0).forEach(System.out ::println);
	 
	List<Integer>list1= list.stream().filter(i->i%2==0).collect(Collectors.toList());  //list return by collectors
	 System.out.println(list1);
	 
	 List<Student>studnetlist=Arrays.asList(
			 new Student("A",56),
			 new Student("B",66),
			 new Student("C",67),
			 new Student("D",90),
			 new Student("E",58)
			 );
	 
	 System.out.println("---------------------");
	 
	 List<Student>filteredlist=new ArrayList<>();
	 for (Student s : filteredlist) {
		if(s.getPercentage()>=65) {
			filteredlist.add(s);
		}
	}
	 System.out.println(filteredlist);
	 
	 System.out.println("---------------------");
	 
	 
	 List<Student>r1= studnetlist.stream().filter(i->i.getPercentage()>=65).collect(Collectors.toList());
	 System.out.println(r1);
	 
	 
	 List<Student>r= studnetlist.stream().filter(i->i.getPercentage()>=65&&i.getPercentage()%2==0).collect(Collectors.toList());
	 System.out.println(r);
	 
	 System.out.println("---------------------");
	 
	 
	 
	 
	 //map
	 
	 List<Integer>list5=Arrays.asList(1,2,3,4,5,6);
	 
	 List<Integer>a3=list5.stream().map(i->i*i).collect(Collectors.toList());
	 System.out.println(a3);
	 
	 list5.stream().map(i->i*i).forEach(System.out::println);
	 
	 //I want to do square operation on even number only
	 
	  List<Integer>r6= list5.stream().filter(i->i%2==0).map(i->i*i).collect(Collectors.toList());
	 //System.out.println(r6);
	  r6.stream().forEach(System.out::println);
	  
	  
}
}
