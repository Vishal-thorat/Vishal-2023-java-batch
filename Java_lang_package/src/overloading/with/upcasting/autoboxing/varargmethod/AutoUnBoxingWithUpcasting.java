package overloading.with.upcasting.autoboxing.varargmethod;

public class AutoUnBoxingWithUpcasting {   //Primitive
	
	public void m1(long l) {
		System.out.println("long l");
	   }
		public void m1(Long l) {
			System.out.println("Long l");
		}
//		public void m1(Object o) {
//			System.out.println("Object o");
//		}
		
		public static void main(String[] args) {
			
			AutoUnBoxingWithUpcasting a=new AutoUnBoxingWithUpcasting();
			Integer i=10;
			a.m1(i);
			
		}

		/*
		 * Here we are passing as wrapper class Object 
		 * match 
		 * child to parent
		 * AutoUnboxing  Integer unboxing Int -   wrapper to primitive
		 * then find match 
		 * upcasting
		 */
}


