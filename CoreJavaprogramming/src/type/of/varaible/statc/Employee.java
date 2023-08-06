package type.of.varaible.statc;

public class Employee {
	
	int empId;
	String name;
	long cellNumber;
	static String officeName;
	
	void m1() {
		System.out.println("I am m1 method ");
		
	}
	
	static void s1() {
		System.out.println("I am static method ");
	}
	
	void m2() {
		System.out.println(empId);
		System.out.println(name);
		System.out.println(cellNumber);
		m1();
		
		System.out.println(officeName);  //Employee.OfficeName
		s1();                             //Employee.s1();
		
	}

	static void s2() {
		System.out.println(officeName); // Employee.OfficeName
		s1();                             //Employee.s1();
		
		
//		System.out.println(empId);
//		System.out.println(name);
//		System.out.println(cellNumber);
//		m1();
//		
		Employee e =new Employee();
		
		System.out.println(e.empId);
		System.out.println(e.name);
		System.out.println(e.cellNumber);
		e.m1();
}

}
