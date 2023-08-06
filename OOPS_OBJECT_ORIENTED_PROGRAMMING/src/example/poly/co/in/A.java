package example.poly.co.in;

public class A {
	
	void m1(long l) {
		System.out.println("I am long l");
	}
	void m1(Integer i) {
		System.out.println("I am integer Object type");
	}
   
	public static void main(String[] args) {
		A a=new A();
		Byte b=10;
		a.m1(b); //
		//a.m1(10);
		
	}
	
}
