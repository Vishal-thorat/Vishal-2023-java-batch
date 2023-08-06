package example.poly.co.in;

class M {
}

class N extends M {
}

class Z extends N {
}

class L extends Z {
}

public class WhoCall {

	void m1(N n) {
		System.out.println("m1(N)");
	}

	void m1(M m) {
		System.out.println("m1(M)");

	}

	void m1(Z z) {
		System.out.println("m1(Z)");
	}

	void m1(Object o) {
		System.out.println("m1(Object)");
	}
	
	public static void main(String[] args) {
		WhoCall k=new WhoCall();
		L l=new L();
		k.m1(l);
		
		N n =new Z();
		k.m1(n);
	}
	
}
