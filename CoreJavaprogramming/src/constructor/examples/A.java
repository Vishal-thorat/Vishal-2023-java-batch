package constructor.examples;

public class A {
	int a;
	int b;
    A(){}
  
  //No property in this class
	A(int x,int y){
		a=x;
		b=y;		
	}
	
	void m1(int x,int y) {
		
		a=x;
		b=y;
	}
	
	void updateA(int x) {
	a=x;
}
}