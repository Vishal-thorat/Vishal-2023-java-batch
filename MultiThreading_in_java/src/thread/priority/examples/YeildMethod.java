package thread.priority.examples;

class Job extends Thread{
	@Override
	public void run() {
	for (int i=0;i<10;i++) {
		System.out.println(Thread.currentThread().getName());
		Thread.yield();
	}
	}
}

public class YeildMethod {
public static void main(String[] args) {
	
	Job j=new Job();
	j.start();
	for (int i=0;i<10;i++) {
		System.out.println(Thread.currentThread().getName());
		
	}
	
}

}
