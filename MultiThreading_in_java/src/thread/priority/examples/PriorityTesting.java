package thread.priority.examples;

class MyJob extends Thread {
	@Override                                 // priority testing --output no gareenty
	public void run() {

		for (int i = 1; i <= 20; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}

public class PriorityTesting {

	public static void main(String[] args) {

		MyJob j1 = new MyJob();
		j1.setName("R");
		j1.setPriority(1);
		j1.start();

		MyJob j2 = new MyJob();
		j2.setName("G");
		j2.setPriority(2);
		j2.start();

		MyJob j3 = new MyJob();
		j3.setName("B");
		j3.setPriority(3);
		j3.start();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName());
		}

	}

}
