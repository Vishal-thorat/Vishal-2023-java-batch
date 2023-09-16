package logiccal_opt_short_circuit_operator;

public class Logical_Operator {
//	public static void main(String[] args) {
//		int a=10;
//		int b=20;
//		
//		if(a+10 == b && b==20) {
//			System.out.println("True part");
//		}else{
//			System.out.println("false part");
//	}
		
	static	int a=10;
	static	int b=20;
		
		public static boolean exp1() {
			return a+10==b;
		}
		public static boolean exp2() {
			return b==20;
		}
		
		public static void main(String[] args) {
			
	
		
		if(Logical_Operator.exp1() && Logical_Operator.exp2()) {
			System.out.println("True part");
		}else{
			System.out.println("false part");
	}
		
		
		
	}
}
