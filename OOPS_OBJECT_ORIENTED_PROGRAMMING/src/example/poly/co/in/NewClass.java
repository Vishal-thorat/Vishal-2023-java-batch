package example.poly.co.in;

public class NewClass {
	public void m1(int a) {
		System.out.println("m1(int )");
	}
	
	public void m1(Number n) {
		System.out.println("m1(Number )");
	}
	
	public void m1(Object o) {
		System.out.println("m1(Object )");
	}

	
	public static void main(String[] args) {
		
		NewClass n=new NewClass();
		Byte b=10;
		n.m1(b);
		
		float f=23.10f;  //primitive promo boxing parent of float 
		n.m1(f);
		
		byte b1=10;
		n.m1(b1);
		
		
		boolean b2=true;
		n.m1(b2);
		
		boolean b3=false;
		n.m1(b3);
		
		
	}
}
