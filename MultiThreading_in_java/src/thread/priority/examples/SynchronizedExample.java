
package thread.priority.examples;

class Job11{   //data goes one by one
	synchronized void Myjob(String message) {
		for (int i=1;i<=10;i++) {
			System.out.println(message+" " +i);
	}
}
}

class ChildThread extends Thread{
	String message;
	Job11 job;
	ChildThread(String message,Job11 job){
		this.message=message;
		this.job=job;
	}
		@Override
		public void run() {
			job.Myjob(message);
//		for (int i=1;i<=10;i++) {
//			System.out.println(message+" " +i);
//		}
		}	
}


public class SynchronizedExample {
	public static void main(String[] args) {
		Job11 job=new Job11();
		ChildThread t1=new ChildThread("I am Dhoni Thread",job);
		ChildThread t2=new ChildThread("I am Raina Thread",job);
		ChildThread t3=new ChildThread("I am HARDIK Thread",job);
		t1.start(); t2.start(); t3.start();
		
		for (int i=1;i<=10;i++) {
			System.out.println("I am main method & parent method running me " + i);
		}
	}

}
