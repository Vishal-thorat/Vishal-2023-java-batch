package thread.creation.way1;

class ChildJob implements Runnable{
	@Override
	public void run() {
		System.out.println("I am child thread way 1");
	}
}

public class Controller {
	public static void main(String[] args) {
	
		Thread t=new Thread(new ChildJob() );  //
		t.start();  //thread ke constructor ke object pass kiye hai uski run method call karte hai
		
		System.out.println("I am main thread");
	}

}
