package array_vs_Collection_Api;

public class GenericExample {
public static void main(String[] args) {
	
//	PlusOperation p=new PlusOperation();
//	System.out.println(p.add(10, 30));
	
	
	PlusOperation <Integer>p1=new PlusOperation<>();
	System.out.println(p1.add(10));
	
	
	MyStorage<Integer,String>m1=new MyStorage<>();
	m1.a=10;
	m1.b="Hello";
	m1.printInfo();
	
	
	
}
}
