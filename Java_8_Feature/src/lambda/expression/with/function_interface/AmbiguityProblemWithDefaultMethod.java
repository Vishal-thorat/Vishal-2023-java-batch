package lambda.expression.with.function_interface;

interface AA{
	void m1();
	default void foo() {
		
	}
}

interface BB{
	void m2();
default void foo() {
		
	}
}
public class AmbiguityProblemWithDefaultMethod implements AA,BB {

	//porblem occured then override foo methodds
	
	@Override
	public void foo() {
		
		AA.super.foo();
	}
	
	@Override
	public void m1() {
	}
	@Override
	public void m2() {
		
	}
}
