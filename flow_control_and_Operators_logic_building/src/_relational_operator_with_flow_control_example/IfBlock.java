package _relational_operator_with_flow_control_example;

public class IfBlock {
public static void main(String[] args) {
	
	boolean flag=true;   //false
	boolean f=10>8;
	Logic l=new Logic();
	l.getResult(10, 8);  ///Expression
	
	if(l.getResult(12, 10)) {
		System.out.println("I am iinside if control flow");
	}
	if(l.getFirstNumber() > l.getSecondNumber()) {
		System.out.println("I am inside second loop");
	}
	if(flag) {
		System.out.println("I am Inside if control block");
	}
	System.out.println(" I am end line of main method");
}
}
