package language.fundamentals;

public class Typecasting {

	public static void main(String[] args) {

		// Upcasting

		byte b = 10;
		int i = b;
		System.out.println(i); // 10

		char ch = 'A';
		int aa = ch;
		System.out.println(aa); // 65

		byte bb = 1;
		float f = bb;
		System.out.println(f); // 1.0

		float ff = 10f;
		double dd = ff;
		System.out.println(dd); // 10.0

		float f1 = 89.75f;
		double d1 = f1;
		System.out.println(d1); // 87.75

		long l2 = 456545656238979632l;
		float f2 = l2;
		System.out.println(f2); // 4.56545653E17

		// Downcasting

		int i1 = 1;
		byte b1 = (byte) i1;
		System.out.println(b1);

		int i2 = 4544654;
		byte b2 = (byte) i2;
		System.out.println(b2); // unpredicated answer

		// data loss

		double d2 = 123.678;
		int i3 = (int) d2;
		System.out.println(i3);

		long l3 = (long) f2;
		System.out.println(l3);
		
		float f4 =45.89f;
		long l4=(long)f4;
		System.out.println(l4);

	}
}
