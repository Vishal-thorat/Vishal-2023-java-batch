package equality_operator;

public class Test {
	public static void main(String[] args) {

		System.out.println(10==11);  //false
		
		System.out.println('A' == 65); //true
		System.out.println(65.2 == 65);  //false
		
		System.out.println(65.2 != 65);  //true
		
		System.out.println(true == false);  //false
		
		System.out.println(false == false);  //true
		
		System.out.println(65.2 == 65 ==false);  //true
		
	//	Negative case
//		System.out.println(23 ==true);
//		
//		System.out.println(65!=65); false
		
	}
}
