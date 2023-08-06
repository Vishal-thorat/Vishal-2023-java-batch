package language.fundamentals;

public class A {

		int a;
		int b;
		int x;
		
		void m1(int a,int b,A o) {
			System.out.println(a);
			System.out.println(b);
			System.out.println(o.a);
			System.out.println(o.b);
			System.out.println(this.a);
			System.out.println(this.b);
			System.out.println(x);
			System.out.println(o.x);
			System.out.println(this.x);
		}

	}


