package while_loop;

public class Case1 {
public static void main(String[] args) {
	
//	boolean b=true;
	
  final	boolean b=true;  //compile time constant

	while(b) {
		System.out.println("While loop body");
//		b=false;
	}
//	System.out.println("Out side of while loop body");    //Unreachable code
}
}
