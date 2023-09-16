package break_pack;

public class Case8 {
	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if(i!=j) {
				System.out.println("("+i+" "+j+")");    // (1,2)   (2,1)  (3,1)
				 // // this break is applicable on inner loop 
				}
				else {
					
				continue;	 // this break is applicable on outer loop
				}
		System.out.println("##");
			}
	 
		}

	}
}
