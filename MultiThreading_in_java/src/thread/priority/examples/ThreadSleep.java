package thread.priority.examples;


class Job1 extends Thread{
	@Override
	public void run() {
	for (int i=0;i<10;i++) {
		System.out.println(Thread.currentThread().getName()+""+i);
		if(i==5) {
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {}
		}
	}
	}
}

public class ThreadSleep {
public static void main(String[] args) {
	
	Job1 j=new Job1();
	j.start();
	for (int i=0;i<10;i++) {
		System.out.println(Thread.currentThread().getName());
		
	}
	
}

}
