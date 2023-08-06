package finaally_block_example;

public class JVMOFF {
	
public static void main(String[] args) {
		
			JVMOFF obj =new JVMOFF();
			obj.testMe();
		}

		void testMe() {
		
			System.out.println("1");
			try {
				System.out.println("2");
		  System.exit(0);              //JVM SHUTDOWN
			}catch(Exception e) {
	
				System.out.println("3");
			}finally {                                //Finally block always dominates return block  l
				System.out.println("4");
			}
			System.out.println("5");    //124
		}
	}


