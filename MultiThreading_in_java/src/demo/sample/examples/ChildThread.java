package demo.sample.examples;

public class ChildThread extends Thread {
	@Override
	public void run() {
		int i=10000;
		while(i>0) {
			System.out.println("child >> " +i);
			i--;
		}
		
		
	}

}
