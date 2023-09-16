package conditional_operator_example;

public class Test1 {
public static void main(String[] args) {
	int a=100;
	int b=200;
	
//	if(a>b) {
//		System.out.println("A is big number ");
//	}else {
//		System.out.println("b is big number");
//	}
	
	//using conditional operator               //     --Ternary operator
	int r=(a>b)?a:b;
	System.out.println("larger no is r");
}
}
