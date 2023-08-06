package problem.With.Data;

class AA{
	public Integer i=100;   //static
	void m1() {
		i=i-1;
		i=i-1;
		i=i-1;
		i=i-1;
		System.out.println(Thread.currentThread().getName() + " "+  this.i);  //A
	}
}

class MyThread extends Thread{
	@Override
	public void run() {
		AA a=new AA();  
		a.m1();      
		
	}
}

public class ProblemwithdataThread {
public static void main(String[] args)throws Exception {
	MyThread t1=new MyThread();
	MyThread t2=new MyThread();
	MyThread t3=new MyThread();
	MyThread t4=new MyThread();
	
	t1.start(); 
	t2.start(); 	
	t3.start(); 	
	t4.start();
}
}
