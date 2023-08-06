package method.Overriding.examples;

class P{
	 void m1() {
		System.out.println("I am P class m1 method ");
	}
	static void m2() {
		P p=new C();
		p.m1();
	}
}
class C extends P{
	 void m1() {
		System.out.println("I am C class m1 method ");         //compile time polymorphism
		                                                         //override //private dont override 
	}
}



public class RuleForMethodOverrriding {
	
	public static void main(String[] args) {
		P p=new C();
		p.m2();
	}

}
