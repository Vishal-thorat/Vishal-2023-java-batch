package problem.With.Data;

//
//
//}

class AAAA{
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

class MyThreadss extends Thread{
	
	AAAA a;
	MyThreadss (AAAA a){
		this.a=a;         //Mutiple Thread wait 5ns And Multiple Objects
	}
	
	@Override
	public void run() {
		//AAAA a=new AAAA();    //Twist is there play and pause wait 100 % intresesting 
		a.m1();      
		
	}
}

public class Synchronized_example {
public static void main(String[] args)throws Exception {        //data output in consistency problem --solution one data updated by multiple people 
	AAAA a=new AAAA();
	MyThreadss t1=new MyThreadss(a);                                        //case 1 at a time 2 people upadated data --problem occured
	MyThreadss t2=new MyThreadss(a);
	MyThreadss t3=new MyThreadss(a);
	MyThreadss t4=new MyThreadss(a);
	
	t1.start(); 
	t2.start(); 	
	t3.start(); 	
	t4.start();
}
}
