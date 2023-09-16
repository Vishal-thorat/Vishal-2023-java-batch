package logiccal_opt_short_circuit_operator;

public class Test {
public static void main(String[] args) {
	int a=10;
	int b=13;
	// true , a=11; b=14, true
	if(a++ ==10 && ++b==14) {
		System.out.println("I am true part");
		a++;
		b++;
	}else {
		System.out.println("I am False part");
		
	}
	
	System.out.println(a);//12
	System.out.println(b);//15
}
}
