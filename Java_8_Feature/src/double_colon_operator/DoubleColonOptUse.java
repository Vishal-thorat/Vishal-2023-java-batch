package double_colon_operator;

public class DoubleColonOptUse {

	public static void main(String[] args) {
		
	//	Cal c=x->System.out.println(x*x);  // Happy Flow  own logic
		
	//  Cal c1=new MathsOperation()::instanceMethod;  // Existing instance method logic reuse
		
//		Cal c= MathsOperation::staticMethod;  // Existing instance method logic reuse
		
		Cal c= MathsOperation::new;  //use existingconstructor logic
		
		c.square(100);
		//c1.square(20);
				
	}
}
