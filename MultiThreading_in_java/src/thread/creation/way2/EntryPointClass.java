package thread.creation.way2;

//public class EntryPointClass {
	
//	void m1() {
//		Thread t= Thread.currentThread();
//		System.out.println(t.getName());  //main
//	}
//
//	public static void main(String[] args) {
//		
//		Thread t= Thread.currentThread();
//	    t.setName("Parent-thread");             //Parent-thread
//		EntryPointClass e=new EntryPointClass();
//		e.m1();
//	}
	
	class Worker extends Thread{
		@Override
		public void run() {
			Thread c= Thread.currentThread();
			System.out.println("I created thread"+c.getName());
		}
	}
	
	public class EntryPointClass {
	public static void main(String[] args) {
		Thread c= Thread.currentThread();
		//c.setName("Parent");
		
		Worker w=new Worker();
		w.setName("child");
		w.start();
		System.out.println("I am main thread"+c.getName());
	}
	
	
}
