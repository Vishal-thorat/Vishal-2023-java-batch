package if_else_statement;

public class IfElseRule {
public static void main(String[] args) {
	if(true) {
		int a=10;
		System.out.println(args);
		{
			int b=200;
		}
//		System.out.println(b);
	}
//	System.out.println(a);  inner block value cannot access outer block
}
}
