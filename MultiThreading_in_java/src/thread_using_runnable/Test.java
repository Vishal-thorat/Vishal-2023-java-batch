package thread_using_runnable;

class MyJob implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}



public class Test {
	public static void main(String[] args) {
		
		Thread t=new Thread(new MyJob(), "vishal");
		t.start();
		System.out.println(Thread.currentThread().getName());
	}

}
