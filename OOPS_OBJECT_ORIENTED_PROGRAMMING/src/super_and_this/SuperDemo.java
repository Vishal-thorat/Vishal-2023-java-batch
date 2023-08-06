package super_and_this;

class A{
	A(){
		super();
		System.out.println("I am  A class Constructor");
	}
	
	}

class B extends A{
	B(){
		super();	  //bracause no can access property of parent class  --and it is in first line
	}
}
public class SuperDemo {
	SuperDemo(){
		super();
	}
  public static void main(String[] args) {
	B b=new B();                                  //I am  A class Constructor"
}
}
