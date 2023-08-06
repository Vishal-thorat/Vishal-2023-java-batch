package demo.sample.examples;

public class RunTask {
	
	public void doOperation() {
		long l=0l;
		for (int i=1001;i<=2000;i++) {
			l=l+i;
			
		}
		System.out.println("I am chiild thread"+ l);
	}

}
