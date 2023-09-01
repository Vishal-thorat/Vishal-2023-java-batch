package map.example.interviewQuestion;

class Employee{
	private Integer employeeId;
	private String EmployeeName;
	
	public Employee() {}

	@Override
	public int hashCode() {
		
		return this.getEmployeeId().hashCode()+ this.getEmployeeName().hashCode();  //syntactical sugar
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee e=(Employee)obj;
		if(this.getEmployeeId().equals(e.getEmployeeId()) && this.getEmployeeName().equals(e.getEmployeeName())) {
			return true;
		}
		return false;
	}
	
	public Employee(Integer employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		EmployeeName = employeeName;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", EmployeeName=" + EmployeeName + "]";
	}
	
	
}