package lambda.expression.with.function_interface;

interface Calculator{
	void add(int a, int b);
}


interface B{
	int countChar(String str);
}

public class TestWithLambdaExpression {
public static void main(String[] args) {
	Calculator c =(a,b)->System.out.println(a+b);
	c.add(10, 20);
	
	
//	B b=(String str)->{return str.length();};   //B b=str->str.length();
	
	B b=(str)->str.length();
	int count =b.countChar("hi hello");
	System.out.println(count);
}
}
