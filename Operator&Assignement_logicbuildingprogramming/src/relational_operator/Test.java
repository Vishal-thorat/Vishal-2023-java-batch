package relational_operator;

public class Test {
	public static void main(String[] args) {

		// Relational operator (Binary operator)

		int a = 10;
		int b = 20;

		boolean r = a > b;
		System.out.println(r); // false

		int a1 = 10;
		int a2 = 10;

		boolean r1 = a1 > a2;
		System.out.println(r1); // false

		boolean r2 = a1 >= a2; // true

		boolean r3 = a1 <= a2; // true
		
		int a5=66;
		double a6=66.00;
		
		
		boolean r5=a5>=a6;
		System.out.println(r5);  //true  double a6=66.01;  --false
		
		char ch='B';
		System.out.println(a5>=ch);  //true

		
		//negative cases
		
//		boolean b9=true;
//		boolean b10=true;
//		boolean r11 =b9 >= b10;
//		
//		int a11=10;
//		int a12=20;
//		int a13=30;
//		
//		boolean r56=a11<a12<a13;  //The operator < is undefined for the argument type(s) boolean, int ) --true<a13;
//		
		
	}
}
