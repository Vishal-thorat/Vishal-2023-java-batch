package example.poly.co.in;

public class MethodOverloding { 
	public void m1(int a,int b) {} //m1(int ,int )
	
	public void m1(int a,int b,int c) {} //m1(int ,int ,int)
	
	public void m1(float f ,int b ) {}  //m1(float ,int )
	
	public void m1(int a,float f) {}  //m1(int, float)
	
}

//method overloading   //1) method should be same 
                       //2)parameter should be diff	
 						//3)count data type diff ,sequence