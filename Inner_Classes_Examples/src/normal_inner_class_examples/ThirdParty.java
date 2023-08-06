package normal_inner_class_examples;

import normal_inner_class_examples.Outer.Inner;

public class ThirdParty {
	

		void m1() {
		Outer o=new Outer();
		Outer.Inner i=o.new Inner();
		i.m1();
		
	}
	
	public static void main(String[] args) {

		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.m1();

	}
	
	// Inside Normal inner class u can't declare static
	//we can't declare main method

}
