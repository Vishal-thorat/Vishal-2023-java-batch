package while_loop;

public class Case2 {
	public static void main(String[] args) {

		final boolean b = false;
		while (b) { 
			System.out.println("While loop body");   // Unreachable code


		}
		System.out.println("Out side of while loop body"); 
	}
}
