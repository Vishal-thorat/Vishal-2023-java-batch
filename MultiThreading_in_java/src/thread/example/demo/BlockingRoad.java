package thread.example.demo;

class CommonWork1{
	
	int sum=0;
	synchronized public void sum() {     //output change without synchronized
		
		System.out.println("I am first line ");
		System.out.println("I am Second line ");
		System.out.println("I am Third line ");
		
		synchronized(this) {
		for (int i=1;i<=100;i++) {
			sum=sum+i;
		}
		System.out.println(Thread.currentThread().getName()+" "+sum);    //road blockage by 200meter   
		sum= 0;
		
		}
		System.out.println("I am last line ");
		System.out.println("I am Second line ");
		System.out.println("I am first line ");
	}
}

class mylogic1 extends Thread{
	CommonWork1 c;
	

	 mylogic1(CommonWork1 c){
		this.c=c;
	}
	@Override
	public void run() {
		c.sum();
	}
}
public class BlockingRoad {
public static void main(String[] args) {
	CommonWork1 c=new CommonWork1();
	mylogic1 m=new mylogic1(c);
	mylogic1 m1=new mylogic1(c);
	mylogic1 m2=new mylogic1(c);

	m.start();
	m1.start();
	m2.start();
	
}
}
