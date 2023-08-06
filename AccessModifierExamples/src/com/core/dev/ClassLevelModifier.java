package com.core.dev;

abstract public class ClassLevelModifier {
     
	abstract void doSum();
	
	class Child extends ClassLevelModifier{
		void doSum() {}
	}
	
	
}
