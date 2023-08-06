package equals.method.example;


class A{
	int x;
	int y;
	
//	@Override                                         //equals overide
//	public boolean equals(Object obj) {    //object obj=new A();     that the answer came true
//		A a2=(A)obj;
//		if(this.x== a2.x && this.y ==a2.y) {
//			return true;
//		}
//			return false;
//	}
}




public class Demo {
public static void main(String[] args) {
	A a1=new A();
	a1.x=10;a1.y=20;
	
	A a2=new A();
	a2.x=10;a2.y=20;
	
	boolean r=a1.equals(a2);   //internally a1==a2
	System.out.println(r);  //false 
	
	
}
	
}
