package control_flow;

public class WhileLoopExampple {
public static void main(String[] args) {
	
//	int i=5;
//	while(i<=50) {
//		System.out.println(i);
//		i=i+5;
//	}
	
	int i=1;
	while(WhileLoopExampple.validateNumber(i)) {
		System.out.println(i);
		i=i+1;
	}
		
}	
		
		public static boolean validateNumber(int i) {
		boolean r=i<=10;
		return r;
	}
	
}
