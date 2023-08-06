package problem.With.Data;


/*
 * start
Exception in thread "Thread-0" java.lang.ArithmeticException: / by zero
	at problem.With.Data.B.run(ChildExceptionThread.java:8)
 */






class B extends Thread{
	@Override
	public void run() {
		
		System.out.println("start");
        int i=10/0;
		
		System.out.println("End");
	}
}

public class ChildExceptionThread {

	public static void main(String[] args) {
		
      B b=new B();
      b.start();
	}
}
