package overloading.with.upcasting.autoboxing.varargmethod;

public class WideningOrUpcastingOfPrimitive {

	public void m1(long l) {
		System.out.println("Upcasting long l");
		}
	
	public void m1(Long l) {
		System.out.println("Long l");
		}
	
	public void m1(Object o) {
		System.out.println("Object o");
		}
	
	public void m1(Integer i) {
		System.out.println("AutoBpxing integer i");
	}
	
	public void m1(int ...x) {
		System.out.println("Var-arg");
	}
	
	public void m1(int i) {
		System.out.println("Match Found");
	}
	public static void main(String[] args) {
		WideningOrUpcastingOfPrimitive w=new WideningOrUpcastingOfPrimitive();
		int i=10;
		w.m1(i);  //Int
	}
}
