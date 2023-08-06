package multithreading.use.cases;

class Task extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			Thread c = Thread.currentThread();
			System.out.println("Current Thread Name" + c.getName());
		}	
	}
	
	@Override
	public synchronized void start() {
		// TODO Auto-generated method stub
		super.start();
	}
}

public class MultiThreadingUseCases {                //concurrent exceution --at time done  --round robin algorithm  --thoda thoda kam karte hai thread 
	public static void main(String[] args) {
		Task t=new Task();
		t.start();
		
		Task t1=new Task();                        //Concurrent Threading  --alternative work doing --utilization fine --perfomance best
		t1.start();
		                                //one core and 4 thread doing concurrently work
		Task t2=new Task();
		t2.start();
		
		for (int i = 0; i <= 100; i++) {
	
			System.out.println("Current main  Thread Name" +Thread.currentThread());
		}
		
	}
}
