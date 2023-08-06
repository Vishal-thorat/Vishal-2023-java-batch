package pac_2;

//import pac_1.A;
//
//public class Controller {
//
//	
//	public static void main(String[] args) {
//		
//	System.out.println(A.str);
//	A.m1();
//	
//	}
//}


  // Static Import



import static pac_1.A.str;

import pack1.A;

import static pac_1.A.m1;

public class Controller {

	
	public static void main(String[] args) {
		
	System.out.println(str);
	m1();
	
	A a =new A();
	
	}
}