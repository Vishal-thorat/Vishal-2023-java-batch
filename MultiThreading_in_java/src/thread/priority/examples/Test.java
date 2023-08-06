package thread.priority.examples;

class Task2 extends Thread{
	@Override
	public void run() {
		
//		for (int i=1;i<=20;i++) {
//			System.out.println(Thread.currentThread().getName());
//		}
		
		System.out.println(Thread.currentThread().getName() + " : " +Thread.currentThread().getPriority());
		
		
	}
}



class Task1 extends Thread{
	@Override
	public void run() {
		
//		for (int i=1;i<=20;i++) {
//			System.out.println(Thread.currentThread().getName());
//		}
		
		System.out.println(Thread.currentThread().getName() + " : " +Thread.currentThread().getPriority());
		
		
	}
}




public class Test {
	
	public static void main(String[] args) {
		
//		Task1 t1=new Task1();
//		t1.setName("orange");
//		
//		Task1 t2=new Task1();
//		t2.setName("white");
//		
//		Task1 t3=new Task1();
//		t3.setName("green");
		
//		Thread t=new Thread();
//		t.start();
//		System.out.println(t.getPriority());   //priority 5
		
//		System.out.println(Thread.currentThread());  //Thread[main,5,main]
		
		System.out.println(Thread.currentThread().getName() + " : "+ Thread.currentThread().getPriority());    //main : 5
		                                                                                                        //Thread-0 : 5
		
		Task2 t1=new Task2();
		t1.start();
	}

}
