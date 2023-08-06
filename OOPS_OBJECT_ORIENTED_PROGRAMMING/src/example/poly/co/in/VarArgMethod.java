package example.poly.co.in;

public class VarArgMethod {
	
	
	void m1(int a) {
		System.out.println("m1(int a)");
	}
	
	//var args method
	void m1(int...a) {
		System.out.println(" I am Var args meethod");
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
	}

	System.out.println("---------------------");
	}
	
	public static void main(String[] args) {
		VarArgMethod v=new VarArgMethod();
		v.m1();
		v.m1(1);
		v.m1(1,2,3);
		v.m1(1,2,3,4,5,6);
	}
}
