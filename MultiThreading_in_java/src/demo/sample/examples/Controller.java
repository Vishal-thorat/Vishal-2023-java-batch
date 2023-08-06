package demo.sample.examples;

public class Controller {

	public static void main(String[] args) {
		
		ChildThread childthread =new ChildThread();
		childthread.start();
		
		int i=1000;
		while(i>0) {
			System.out.println("parent >> " +i);
			i--;
		}
		
		
		//void start() {} //this.run();
		
		
	}
}
