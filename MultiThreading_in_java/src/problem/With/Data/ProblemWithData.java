package problem.With.Data;

class A{
	public Integer i=100;
	void m1() {
		i=i-1;
		i=i-1;
		i=i-1;
		System.out.println(this.i);
	}
}


public class ProblemWithData {
public static void main(String[] args) {
	A a=new A();  //fresh object in that 100 and then execution
	a.m1();       //97
	
	A a1=new A();
	a1.m1();       //97
	
	A a2=new A();
	a.m1();     //94
}
}
