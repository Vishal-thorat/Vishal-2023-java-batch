package example.exception.handling;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		System.out.println("Start");
//		int a=10/0;
		
		int a[] = {10,20,30,40,50,60,70};   //0-6   a[7]
		for (int i=0;i<=a.length;i++) { 
			try {
			
		                              //	for (int i=0;i<=a.length;i++) {   Exception 
			System.out.println(a[i]);    //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7//at example.exception.handling.ExceptionHandling.main(ExceptionHandling.java:12)
			}catch(Exception e) {
				System.out.println("Sorry i will  take care");
			}
		                                  
		}
		
		System.out.println("Normal End");
	}

}
