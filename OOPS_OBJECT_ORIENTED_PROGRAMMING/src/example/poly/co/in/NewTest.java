package example.poly.co.in;

public class NewTest {
 
	void m1(int a) {
		System.out.println("m1(int)");
	}
	
	void m1(Byte b) {
		System.out.println("m1(Byte)");
	}
	
	public static void main(String[] args) {
		NewTest t=new NewTest();
		byte b=10;
		t.m1(b);  //m1(int)
		
		t.m1(10); //m1(int)
	}
}
