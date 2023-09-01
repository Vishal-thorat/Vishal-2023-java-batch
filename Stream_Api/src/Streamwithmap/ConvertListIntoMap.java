package Streamwithmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;



class Employee{
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee() {}

	
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



public class ConvertListIntoMap {
public static void main(String[] args) {
	
	List<Employee>list=Arrays.asList(
			new Employee(1,"A",25000.10),
			new Employee(1,"B",35000.10),
			new Employee(1,"C",25000.10),
			new Employee(1,"D",9000.10),
			new Employee(1,"E",2500.10),
			new Employee(1,"F",1000.10)
			);
	
	Map<Integer, Employee>map=new HashMap<>();
	
	for (Employee employee : list) {
		map.put(employee.getId(),employee);
			}
	System.out.println(map);
	
	Set<Integer> keys = map.keySet();
	for (Integer key : keys) {
		System.out.println(map.get(key));
	}
	
Map<Integer, Employee>maps = 	list.stream().collect(Collectors.toMap(e->e.getId(), e->e));
	map.keySet().stream().forEach(i->System.out.println(i +" "+map.get(i)));
	}
	
}
