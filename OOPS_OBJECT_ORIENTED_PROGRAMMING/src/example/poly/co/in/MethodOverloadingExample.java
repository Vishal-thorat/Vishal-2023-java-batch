package example.poly.co.in;

public class MethodOverloadingExample {  
	
	public void m1(int a,int b) {
		System.out.println("int,int");
	}
	
	public void m1(int x,int y,int a) {
		System.out.println("int,int,int");
	}
	
	public int m1(int x,float y) {
		System.out.println("int,float");
		return 0;
		
	}

public int m1(float f,int x ) {
		System.out.println("float,int");
		return 0;
		
	}
}
