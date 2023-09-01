package lambda.expression.with.function_interface;

interface A{
	int doSum(int a,int b);
}


class AImpl implements A{
	public int doSum(int a, int b) {
		return a+b;
	}
}

class RequiredSumFun{
	void doCal(A a) {          //A a=new AImpl
		int sum=a.doSum(10, 20);
		System.out.println(sum);
	}
}
public class LambdaAsArgToMethod {
public static void main(String[] args) {
	RequiredSumFun r=new RequiredSumFun();
//	A a=new AImpl();
//	//r.doCal(new AImpl());
//	r.doCal(a);	
	
//	A a=(x,y)->x+y;
//	r.doCal(a);
	
	r.doCal((x,y)->x+y);
	
	
}
}
