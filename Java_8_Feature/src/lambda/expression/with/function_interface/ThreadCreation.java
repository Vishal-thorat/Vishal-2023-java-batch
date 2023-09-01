package lambda.expression.with.function_interface;

class MyThread implements  Runnable{
@Override
	public void run() {
	System.out.println(Thread.currentThread().getName());   //Thread-0
		
	}
}
public class ThreadCreation {

	public static void main(String[] args) {
		
		//MyThread m=new MyThread();  //Runnable also write in that
		Thread t=new Thread(new MyThread());
		t.start();
		System.out.println(Thread.currentThread().getName());  //main
	}
}
