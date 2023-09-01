package double_colon_operator;

public class MathsOperation {

	
	public MathsOperation(int a) {
		System.out.println("I am MathsOperation Constructor");
		System.out.println(a*a);
	}
	
	public MathsOperation() {}
	
	public void instanceMethod(int x) {
		System.out.println("I am MathsOperation instanceMethod Constructor");
		System.out.println(x*x);
	}
	static void staticMethod(int s) {
		System.out.println("I am MathsOperation staticMethod Constructor");
		System.out.println(s*s);
	}
}
