package normal_inner_class_examples;

public class Outer {
	Integer a;
	static String name;
	
	Outer(){
		this.a=100;
		name="Hello!!! I am outer static property";
	}
	class Inner{
		Integer a=1000;
		void m1() {
			System.out.println("I am inner class m1() method");
			System.out.println(a);
			System.out.println(name);
		}
	}
	void test() {
		Inner i=new Inner();
		i.m1();
	}

	static void test1() {
		Outer o=new Outer();
		Outer.Inner i=o.new Inner();
		i.m1();
	}
	
	
}
