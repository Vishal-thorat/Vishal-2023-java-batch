package super_and_this;

class Parent1{
	Parent1(){
		super();
		System.out.println("I am Parent class Constructor");
	}
}
class Child1 extends Parent1{
	Child1(){
		this(10);
	}
	Child1(int a){
		this(10,20);
	}
	Child1(int a,int b){
		super();  //parent call
	}
}
public class DifferenceDemo {
public static void main(String[] args) {
	Child1 c=new Child1();
	
}
	
}
