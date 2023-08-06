package problem.With.Data;
class AAAAAA {
	public static Integer i = 100; // static

	 static void m1() { // 
		i = i - 1;
		i = i - 1;
		
		try {
			Thread.sleep(5000); // waiting or sleep  output is in continuous --no stopping
		} catch (Exception e) {
		}
		
		i = i - 1;
		i = i - 1;
		

		System.out.println(Thread.currentThread().getName() + " " + AAAAAA.i); // A
	}
}

class MyThreds extends Thread {
	@Override
	public void run() {
		AAAAAA.m1();
		
	}
}

public class WithoutSync {

	public static void main(String[] args) {
		MyThreds t1=new MyThreds();
		MyThreds t2=new MyThreds();
		MyThreds t3=new MyThreds();
		MyThreds t4=new MyThreds();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
