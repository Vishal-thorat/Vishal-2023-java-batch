package method.Overriding.examples;

public class Parent {

	void m1(int a) {
		int sum = 0;
		for (int i = 0; i < a; i++) {
			sum = sum + a;

		}
		System.out.println(sum);

	}

	class Child extends Parent {
//
//		int m1(int a, int b) {
//			return a * a;
//		}
	
		@Override
		void m1(int a) {
			System.out.println(a*a);
		}
	
	}
}
