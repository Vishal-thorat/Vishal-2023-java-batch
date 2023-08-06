package com.employee.show.info;

import com.employee.info.Employee;
import com.employee.info.EmployeeInfo;

class ShowEmployeeInfo {
	
	public static void main(String[] args) {
		
		
		//ArrayList  list new ArrayList();
		
		EmployeeInfo obj=new EmployeeInfo();
		Employee[] employeeArray =obj.getEmployeeInfo();
		
		
		for (int i=0; i<employeeArray.length;i++) {
			System.out.println(employeeArray[i].getEmployeeName());
			System.out.println(employeeArray[i].getEmployeenNumber());
			System.out.println(employeeArray[i].getOfficeName());
			System.out.println("<<<<<<<<<<<<<<<<<<<<");
		}
		//communication between two classes  //import class from another package
		//com.employee.info.Employee obj =new com.employee.info.Employee();
		
	}

}
