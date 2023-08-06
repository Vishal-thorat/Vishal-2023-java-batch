package thread.example.demo;

class ChildThread extends Thread{
	@Override
	public void run() {
		
		Thread t=Thread.currentThread();
		System.out.println(t.hashCode());
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		
		ChildThread c=new ChildThread();
		c.start();
		System.out.println(c.hashCode());  //same hashcode
		
		Thread t=Thread.currentThread();
		System.out.println(t.hashCode());  //diff output
		
	}
}
