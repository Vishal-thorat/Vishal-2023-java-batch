package com.employee.info;

public class EmployeeInfo {

	public Employee[] getEmployeeInfo() {

		Employee[] emp = new Employee[4];

		emp[0] = new Employee("sagar", 25, "Sagar Roadlines");

		emp[1] = new Employee("saurabh", 29, "suruchi milk parlour");

		emp[2] = new Employee("shubham", 20, "Sugar factory");

		emp[3] = new Employee("prathmesh", 24, "BCCI");

		return emp;
	}

}
