package language.info;


class A1{}
class D{}
class E extends D{};


public class EqualityOperator {
	public static void main(String[] args) {
		A1 a=new A1();
		A1 a1=new A1();
		A1 a2=a;
		E e=new E();
		D d=new D();
		
		Object o=new Object();
		// == operator with refernce variable
		System.out.println(a==a1);
		System.out.println();
		System.out.println(e==d);
		System.out.println(o==e);
		//System.out.println(a==e);  //error  equality operator with reference variable
		System.out.println(a == a2);  //true //2 varaiable pointing to one object then it give answer true
		
		int aa=10;
		int bb=20;
		System.out.println(aa == bb);
	}

}
