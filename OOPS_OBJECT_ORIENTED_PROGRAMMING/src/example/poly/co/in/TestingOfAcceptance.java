package example.poly.co.in;

public class TestingOfAcceptance {

	
	void m1(Object o) {
		System.out.println("Object o");  //Parent object number then double means wrapper classes
	}
	
	void m1(Number n) {
		System.out.println("Number n");
	}
	void m1 (Double s) {
		System.out.println("Double s");
	}
	
	public static void main(String[] args) {
		TestingOfAcceptance obj =new TestingOfAcceptance();
		obj.m1(10);
		
		obj.m1(new Integer (10));
		
		obj.m1(null);
		
		
	}
}
