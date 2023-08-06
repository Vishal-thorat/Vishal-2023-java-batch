package demo.sample.examples;

public class NewController {
public static void main(String[] args) {
	MyWorker myworker=new MyWorker();
	myworker.start();
	long l=0l;
	for (int i=1001;i<=2000;i++) {
		l=l+i;
		
	}
	System.out.println("I am main thread ="+l);
}
}
