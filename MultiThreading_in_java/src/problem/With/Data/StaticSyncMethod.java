package problem.With.Data;

class AAAAA {
	public static Integer i = 100; // static

	synchronized static void m1() { // locking concept lock and wait to (release)unlock
		i = i - 1;
		i = i - 1;
		i = i - 1;
		i = i - 1;
		try {
			Thread.sleep(5000); // waiting or sleep
		} catch (Exception e) {
		}

		System.out.println(Thread.currentThread().getName() + " " + AAAAA.i); // A
	}
}

class MyThred extends Thread {
	@Override
	public void run() {
		AAAAA.m1();
		
	}
}

public class StaticSyncMethod {

	public static void main(String[] args) {
		MyThred t1=new MyThred();
		MyThred t2=new MyThred();
		MyThred t3=new MyThred();
		MyThred t4=new MyThred();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
