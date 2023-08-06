package com.abstracts.demo;

abstract public class Parent {
	abstract void m1();

	abstract void m2();
	 void m3() {
		System.out.println("I am m3 method of parent class");
	}
}

class Child extends Parent{
	
	void m1() {
		System.out.println("I am m1 method of child class");
	}
	void m2() {
		System.out.println("I am m2 method of child class");
		
	}
}