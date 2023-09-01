package treeset.example;

public class Employee implements Comparable<Employee> {

	private Integer employeeId;
	private String name;
	
	public Employee() {}
	
	public Employee(Integer employeeId,String name) {
		this.employeeId=employeeId;
		this.name=name;	
	}
	
	@Override
	public int hashCode() {
		return this.employeeId.hashCode() + this.name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee e1=(Employee )obj;
		if(this.employeeId.equals(e1.employeeId) && this.name.equals(e1.name));
		return true;
	}
	
	

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + "]";
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
//default NSO ON ID
/*	@Override
	public int compareTo(Employee o) {
		Integer e1=this.getEmployeeId();
		Integer e2=o.getEmployeeId();
//		if(e1<e2) {
//			System.out.println("-1["+e1 + " " +e2 +"]");
//			return -1;  //no need to swap
//		}else if(e1>e2) {
//			System.out.println("+1["+e1 + " " +e2 +"]");
//			return +1;  //swap it
//		}else {
//			System.out.println("0["+e1 + " " +e2 +"]");
//		return 0; //both are same
//	}
		return e1.compareTo(e2);  //logic this good
		
	}
	*/
	
	//for name se sort  MIXED
	
	@Override
	public int compareTo(Employee o) {
//	String name1=this.getName();
//	String name2=o.getName();
//		return name1.compareTo(name2);
		
		//3 line code convert going to one line
	//	return this.getName().compareTo(o.getName());
		
		String name1=this.getName();
		String name2=o.getName();
		int i=name1.compareTo(name2);  //return 
		if(i==0) {
			return this.compareUsingId(o);
		
		}else {
			return i;
		}
		}
	
	public int compareUsingId(Employee o) {
		Integer e1=this.getEmployeeId();
		Integer e2=o.getEmployeeId();
		if(e1<e2) {
			
			return -1;  //no need to swap
		}else if(e1>e2) {
			
			return +1;  //swap it
		}else {
			
		return -1; //both are same
	}
	
		
	}
	
	
	
	
	//only by string
	
	/*
	 * 
	 * public int compareTo(Employee o) {
		String name1=this.getName();
		String name2=o.getName();
		int i=name1.compareTo(name2);  //return 
		if(i==0) {
			return this.compareUsingId(o);
		
		}else {
			return i;
		}
		}
		
	}
	 */
	
	
	
}
