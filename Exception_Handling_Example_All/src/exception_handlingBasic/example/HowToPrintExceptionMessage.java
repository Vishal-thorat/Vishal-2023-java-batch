package exception_handlingBasic.example;

public class HowToPrintExceptionMessage {

	public static void main(String[] args) {
		
		try {
			Integer i=Integer.valueOf("Ten");
			
		}catch(Exception e) {
//			System.out.println(e);
//			System.out.println(e.toString());
//			System.out.println(e.getMessage());
			e.printStackTrace();                  //preferrable --jvm used this method
		}
		
		System.out.println("<<<<<<<<<<<<<");
		Integer i=Integer.valueOf("Ten");
	}
	
}
