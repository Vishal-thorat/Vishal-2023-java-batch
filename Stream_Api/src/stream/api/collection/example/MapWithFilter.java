package stream.api.collection.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee() {}

//	@Override
//	public boolean equals(Object obj) {
//		Employee e=(Employee)obj;
//		if(e.getId().equals(this.getId())
//				&&e.getName().equals(this.getName())
//				&& e.getSalary().equals(this.getSalary())) {
//			return true;
//		}return false;
//		}
	
	
	public Employee(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
public class MapWithFilter {
public static void main(String[] args) {
	
	List<Employee>list=Arrays.asList(
			new Employee(1,"A",25000.10),
			new Employee(1,"B",35000.10),
			new Employee(1,"C",25000.10),
			new Employee(1,"D",9000.10),
			new Employee(1,"E",2500.10),
			new Employee(1,"F",1000.10)
			);
	
	//Operation
	  List<Employee> output =list.stream().filter(e->e.getSalary()<=10000.00)
	.map(e-> {
		e.setSalary(e.getSalary() +e.getSalary()*10/100);
	  return e;
	})
	.collect(Collectors.toList());
	output.stream().forEach(System.out::println);
	
}
}
