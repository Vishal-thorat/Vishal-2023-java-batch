package constructor.examples;

public class Control {
	
	public static void main(String[] args) {
		
		A a=new A();  //0,0
		a.m1(100,200);//100,200
		
		System.out.println(a.a);
		System.out.println(a.b);
		
		A a1=new A(10,20);
		a1.m1(1000, 2000);
		a1.updateA(5000);
		
		System.out.println(a1.a);//10,20
		System.out.println(a1.b);//1000,2000
	}

			

}
