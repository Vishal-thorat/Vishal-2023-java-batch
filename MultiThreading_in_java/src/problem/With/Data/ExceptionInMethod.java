package problem.With.Data;

public class ExceptionInMethod {
	
	public static void main(String[] args) {
		
		Thread.currentThread().setName("Parent-Thread");
		
		/*
		 * Exception in thread "Parent-Thread" java.lang.ArithmeticException: / by zero
	       at problem.With.Data.ExceptionInMethod.main(ExceptionInMethod.java:17)
		 * 
		 */
		
		//System.out.println("Start" +Thread.currentThread().getName());
		
		/*
		 * Start
         Exception in thread "main" java.lang.ArithmeticException: / by zero
	     at problem.With.Data.ExceptionInMethod.main(ExceptionInMethod.java:9)

		 */
		
		int i=10/0;
		
		System.out.println("End");
	}

}
