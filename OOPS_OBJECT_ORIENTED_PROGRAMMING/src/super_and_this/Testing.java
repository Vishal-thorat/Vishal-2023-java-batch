package super_and_this;


class M{
	int x=10;
	int y=20;
	void m1() {
		System.out.println("I am m1 method of m class");
	}
}
class N extends M{
	int a=100;
	int b=200;
	int x=300;
	void  m3() {
		System.out.println(" I am  m1 method of N class ");
	}
	void m1() {
		System.out.println("I am m1 method of M class");
	}
	void showParentdata() {
		System.out.println(super.x);
		super.m1();
	}
}
public class Testing {
public static void main(String[] args) {
	 N n =new N();

	 n.m1(); //child
	 System.out.println(n.x);//child
	 n.showParentdata();
	 
}

}
