package thread.creation.way2;

class ChildJob extends Thread{
	@Override
	public void run() {
		System.out.println("I am child thread way 1");
	}
}
public class Controller {
	
	public static void main(String[] args) {
	
//		ChildJob c=new ChildJob();
//		c.start();
//		System.out.println("main");
		
		//using runnable ways of this runnable thread child relationship
		Thread t=new Thread(new ChildJob());
		t.start();
		
		
	}

}
