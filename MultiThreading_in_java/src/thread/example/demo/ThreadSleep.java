package thread.example.demo;

class MyThread1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("MyThread 2 >>>>" + i);
		}
	}
}

class MyThread2 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("MyThread 2 >>>>" + i);
			
			if(i==10) {
				try {
					Thread.sleep(2000);
					
				}catch(Exception e) {}
			}
			
		}
	}
}

public class ThreadSleep {
	public static void main(String[] args) {

		
		MyThread1 t1=new MyThread1();
		MyThread2 t2=new MyThread2();
		t1.start();
		t2.start();
		
		for (int i = 0; i <10; i++) {
			System.out.println("parent >>>>" + i);
		}
		
	}
}
