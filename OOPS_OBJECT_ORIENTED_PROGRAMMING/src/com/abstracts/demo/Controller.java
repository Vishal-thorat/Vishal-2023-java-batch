package com.abstracts.demo;

public class Controller {

	public static void main(String[] args) {
		
		//case1
		//Parent p=new Parent();
		
		//case2
		Child c=new Child();
		c.m1();   //I am m1 method of child class
		c.m2();  //I am m2 method of child class
		c.m3();  //I am m3 method of parent class
		
		//case3
		
		Parent p=new Child();
			p.m1();
			p.m2();
			p.m3();
			
			caller(new Child()); //lose coupled  caller(p);    
	}
	
	static void caller(Parent p) {
		p.m1();
		p.m2();  //loose coupling
		p.m3();
	}
}
