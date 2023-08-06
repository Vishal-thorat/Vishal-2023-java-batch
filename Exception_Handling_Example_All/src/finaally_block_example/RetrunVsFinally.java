package finaally_block_example;

public class RetrunVsFinally {
	
	public static void main(String[] args) {
	
		RetrunVsFinally obj =new RetrunVsFinally();
		obj.testMe();
	}

	void testMe() {
	
		System.out.println("1");
		try {
			System.out.println("2");
			int i=10/0;
			return;
		}catch(Exception e) {
			int j=10/0;
			System.out.println("3");
		}finally {                                //Finally block always dominates return block  l
			System.out.println("4");
		}
		System.out.println("5");    //124
	}
}
