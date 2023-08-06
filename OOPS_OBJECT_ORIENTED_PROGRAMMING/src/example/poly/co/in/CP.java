package example.poly.co.in;

public class CP {
 
	int sum(int a,int b) {   //sum(int,int)  // overloading / compile time polymorphism 
		return a+b;    
		
	}
	
	int sum(int a,int b,int c) {
		return a+b+c;
		
	}
	
	int sum(int a,int b ,int c,int d) {
		return a+b+c+d;
		
	}
	
	public static void main(String[] args) {
		CP p=new CP();
		int s=p.sum(10, 20); //sum(int,int)  compile time polymorphism //early binding /static //overloading we have to write /method hiding 
	}
}
