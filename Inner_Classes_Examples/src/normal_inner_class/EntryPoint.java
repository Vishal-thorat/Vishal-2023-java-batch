package normal_inner_class;

import normal_inner_class.Outer.Inner;

class EntryPoint{
	public static void main(String[] args) {
//		Outer o=new Outer();
//		Outer.Inner i=o.new Inner();
		Outer.Inner i=new Outer().new Inner();
		//i.m1();
		
		Outer o=new Outer();
		Inner inner=o.new Inner();
		i.m1();
	}
}