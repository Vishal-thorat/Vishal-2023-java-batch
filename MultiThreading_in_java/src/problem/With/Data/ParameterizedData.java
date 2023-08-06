package problem.With.Data;
class AAA{
	public Integer i=100;   //static
	synchronized void m1() {          //locking concept lock and wait to (release)unlock
		i=i-1; 
		i=i-1;
		i=i-1;
		i=i-1;
		try {
			Thread.sleep(5000); //waiting or sleep
		}catch(Exception e) {}
		
		System.out.println(Thread.currentThread().getName() + " "+  this.i);  //A
	}
}

class MyThreads extends Thread{
	
	AAA a;
	MyThreads (AAA a){
		this.a=a;
	}
	
	@Override
	public void run() {
//		AAA a=new AAA();  
		a.m1();      
		
	}
}

public class ParameterizedData {
public static void main(String[] args)throws Exception {        //data output in consistency problem --solution one data updated by multiple people 
	AAA a=new AAA();
	MyThreads t1=new MyThreads(a);                                        //case 1 at a time 2 people upadated data --problem occured
	MyThreads t2=new MyThreads(a);
	MyThreads t3=new MyThreads(a);
	MyThreads t4=new MyThreads(a);
	
	t1.start(); 
	t2.start(); 	
	t3.start(); 	
	t4.start();
}
}
