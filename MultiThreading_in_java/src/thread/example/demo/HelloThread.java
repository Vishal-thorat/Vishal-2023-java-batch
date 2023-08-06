package thread.example.demo;

class ChildThreads extends Thread {
	@Override
	public void run() {

		Thread t = Thread.currentThread();
		System.out.println(t.hashCode());
	}
}

public class HelloThread {

	public static void main(String[] args) {

		System.out.println("Hello");
		Thread c = Thread.currentThread();
		System.out.println(c.getName());
	}
}
