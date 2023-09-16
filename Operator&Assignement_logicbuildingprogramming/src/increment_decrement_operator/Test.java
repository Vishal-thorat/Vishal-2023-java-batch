package increment_decrement_operator;

public class Test {
public static void main(String[] args) {
	
	
	//pre increment  ++x
	//post increment x++
	
	//pre decrement   --x
	//post decrement  x--
	
	
	int a= 10;
	int b=20;
	
	int c=a++ + ++b;  // c=31
	int z=a-- + ++b;  // z=33
	
	System.out.println(c);  //31
	System.out.println(z);  //33
	System.out.println(a);  //10
	System.out.println(b);  //22
	
	
	int a2=10;
	//C.E
	//1] ++(11)
	
	//2] ++(++a2);
	
	final int u=45;
	//u++
	
}
}
