package set_impl_classes;

import java.util.HashSet;

class Employee{
	private Integer id;
	private String name;
	
	
	public Employee() {}


	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public boolean equals(Object obj) {
		Employee e=(Employee)obj;
		if(this.getId().equals(e.getId()) && this.getName().equals(e.getName())) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.getId().hashCode() + this.getName().hashCode();
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
	
}

public class InterviewQuestion {
	
	public static void main(String[] args) {
		
		HashSet<Employee> set=new HashSet<>();
		set.add(new Employee(11,"A"));  //true          true   id u want true false type boolean b1=
		set.add(new Employee(11,"A"));   //true          false
		
//		Employee e=new Employee(12,"VISHAL");
//		set.add(e); //true
//		
//		Employee e1=e;
//		set.add(e1);  //false  due to add method its is false nd its duplicate
//		
		System.out.println(set.size());   //2 3     becasue hashcode and equals override done 1
		
	}

}
