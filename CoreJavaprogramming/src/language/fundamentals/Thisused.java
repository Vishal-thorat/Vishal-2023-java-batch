package language.fundamentals;

public class Thisused {
	
	int a;
	int b;
	
	void m1(int a,int b) {
//		System.out.println(a);
//		System.out.println(b);
		
		System.out.println(this.a);
		System.out.println(this.b);
	}

	
	
	
	public static void main(String[] args) {
		
		Thisused obj=new Thisused();
	
		obj.a=100;
		obj.b=200;
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		obj.m1(10, 20); //10,20
	}
}
