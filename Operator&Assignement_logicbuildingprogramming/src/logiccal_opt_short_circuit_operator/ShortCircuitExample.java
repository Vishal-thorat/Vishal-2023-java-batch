package logiccal_opt_short_circuit_operator;

public class ShortCircuitExample {
public static void main(String[] args) {
	
	Validate v=new Validate();
	
	if(v.isvalidage(32)&& v.isIndian(91)) {             /// if first operation get falls then it not goes to forward
		System.out.println("please allow him for voter id card");
	}else {
		System.out.println("Sorry for attempt failed");
	}
}
}
