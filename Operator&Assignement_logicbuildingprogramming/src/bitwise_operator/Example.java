package bitwise_operator;

public class Example {
public static void main(String[] args) {
	int a=10;
	int b=20;
	
//	if(b<a || ++a >10) {
//		a++;
//	}else {
//		b++;
//		
//	}
//	System.out.println(a);
//	System.out.println(b);
	
	
	
	if(b<a && ++a >10) {
		a++;
	}else {
		b++;
		
	}
	System.out.println(a);
	System.out.println(b);
	
	
}
}
