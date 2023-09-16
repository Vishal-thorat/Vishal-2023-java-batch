package equality_operator_examples;


class A{}

class B{}

class C extends B{}

public class Example {
	
public static void main(String[] args) {
	
	A a1=new A();
	A a2=new A();
	
//	boolean r1=a1==a2;
//	System.out.println(r1);
	System.out.println(a1==a2);
	
	B b1=new B();
	B b2 =b1;
	System.out.println(b1==b2);
	
	A a3=new A();
	Object o2=new Object();
	System.out.println(a3==o2);  //false
	
	C c=new C();
	B b=new B();
	
	boolean r3=c==b;
	System.out.println(r3);  //false
	
	
	C c1=new C();
	A a7=new A();
	//	boolean r5=c1==a7;  // C.E   NO RELATIONSHIP  BETWEEN CLASS C and A
	
//	C c9=new C();
//	Object o7=new Object();
//	System.out.println(c9==o7);
	
	
//	C c9=new C();
//	Object o7=new C();
//	System.out.println(c9==o7);  //  false
	
//	C c9=new C();
//	Object o7=new C();
//	System.out.println(c9!=o7);  //true
	
	
	C c9=new C();
	Object o7=c9;
	System.out.println(c9==o7);    //true
	
}
}
