package overloading.with.upcasting.autoboxing.varargmethod;

public class MethodOverloadingForNULLObject {

	void m1(Object o) {
		System.out.println("Object o");
	}
	
	void m1(Integer i){
		System.out.println("Integer i");
	}
	
//	void m1(Long l){
//		System.out.println("Long l");
//	}
	
	public static void main(String[] args) {
		MethodOverloadingForNULLObject m =new MethodOverloadingForNULLObject();
		m.m1(null);  // life me No exact match found
		
	}
	
	/*
	 * here I am passing null Object
	 * So whatever method are there required child-parent relation otherwise Exception 
	 * 
	 * compile time error while calling method
	 */
}
