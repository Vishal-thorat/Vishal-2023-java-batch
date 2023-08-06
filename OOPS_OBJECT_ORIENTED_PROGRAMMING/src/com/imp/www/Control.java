package com.imp.www;

public class Control {
	
	public static void main(String[] args) {
		Parent p=new Child();
		p.m1();    //("I am m1 method of parent class");
		p.m2();  //("I am m2 method of parent2 class");
		p.equals(null);  //("I am equals method of parent class");
		
		Object o=new Parent();
		o.equals(null);
		
		
	}

}
