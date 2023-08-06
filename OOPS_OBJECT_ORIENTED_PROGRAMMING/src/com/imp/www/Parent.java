package com.imp.www;

public class Parent {
	void m1() {
		System.out.println("I am m1 method of parent class");
	}

//	public boolean equals(Object obj) {
//		System.out.println(" I am equals method of Parent class");
//		return true;
//	}

	void m2() {
		System.out.println("I am m2 method of parent class");
	}

	public boolean equals(Object obj) {
		System.out.println("I am equals method of parent class");
		return super.equals(obj);
	}

	class Parent1 extends Parent{
		void m2()
		{
			System.out.println("I am m2 method of parent1 class");
		}
	
		void m3()
		{
			System.out.println("I am m3 method of parent1 class");
		}
			
	
	
	class Parent2 extends Parent1{
		void m2()
		{
			System.out.println("I am m2 method of parent2 class");
		}
		
	}
		class Child extends Parent2{
			void m3()
			{
				System.out.println("I am m3 method of child class");
			}
			
		}
			void m4()
			{
				System.out.println("I am m4 method of child class");
			}
			
	}
	}
