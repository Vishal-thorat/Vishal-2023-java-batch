package com.imp.www;

public class Controller {

	public static void main(String[] args) {
		
	
	//case1 
	Parent p=new Parent();
	p.m1();
	p.m2();
	p.getClass();
	System.out.println("-------------------");
	
	//case2
	Child c=new Child();
	c.m1();
	c.m2();
	c.m3();
	System.out.println("-------------------");

	//case3
	
	Parent p1=new Child();
	p1.m1(); //child0
	p1.m2(); //parent
	//p1.m3();
	
	
	//case4
	
	//Child c1=new Parent();
		//c1.m1();
}
}