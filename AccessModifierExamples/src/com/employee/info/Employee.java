package com.employee.info;

public class Employee {

	private String employeeName;
	private int employeenNumber;
	private String officeName;

	public Employee() {
	}

	public Employee(String employeeName, int employeenNumber, String officeName) {
		super();
		this.employeeName = employeeName;
		this.employeenNumber = employeenNumber;
		this.officeName = officeName;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeenNumber() {
		return employeenNumber;
	}

	public void setEmployeenNumber(int employeenNumber) {
		this.employeenNumber = employeenNumber;
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

}

//com.employee.info.Employee