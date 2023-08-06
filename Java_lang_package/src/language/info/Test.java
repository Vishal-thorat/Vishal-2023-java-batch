package language.info;

class A {
	//Class class ;
}

class Student {
	int rollNumber;
	String name;

	Student(int rollNumber, String name) {

		this.rollNumber = rollNumber;
		this.name = name;
	}

	@Override
	public int hashCode() {

		return this.rollNumber;
	}

}

public class Test {
	public static void main(String[] args) {

		A a = new A();
		A a1 = new A();
//		 int h1=a.hashCode();
//		 int h2=a1.hashCode();
		A a2 = a;
		System.out.println(a.hashCode()); // Hashcode --2111991224 its unique number
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode()); // pointing to same Object

		Student s1 = new Student(10, "Alexa");
		Student s2 = new Student(11, "maria");
		Student s3 = new Student(12, "lee");

		System.out.println(s1.hashCode()); // 10,11,12
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());

		// Decimal to hex code conversion ---point 1
		// str=Integer.toHexString(651378);
		String str = Integer.toHexString(a2.hashCode());  //point 1
		System.out.println(str);

		// point 2
		
		//here getclass method return Class class object
//    Class obj=a1.getClass();
//    String name=obj.getName();
//    System.out.println(name);
		
		System.out.println(a1.getClass().getName()); //point 2
		
		
		System.out.println(a1);
		System.out.println(a1.toString());
		System.out.println("-----------");
		System.out.println(a1.getClass().getName()+"@"+Integer.toHexString(a2.hashCode()));
		
	}
}
