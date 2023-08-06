package thread.example.demo;

class CommonWork{
	
	int sum=0;
	synchronized public void sum() {     //output change without synchronized
		
		for (int i=1;i<=100;i++) {
			sum=sum+i;
		}
		System.out.println(Thread.currentThread().getName()+" "+sum);
		sum= 0;
	}
}
class mylogic extends Thread{
	CommonWork c;
	
//	public mylogic(CommonWork c2) {
//		// TODO Auto-generated constructor stub   //testing do do try to sloved stuck
//	}
	 mylogic(CommonWork c){
		this.c=c;
	}
	@Override
	public void run() {
		c.sum();
	}
}
public class SyncThreadingExample {
public static void main(String[] args) {
	CommonWork c=new CommonWork();
	mylogic m=new mylogic(c);
	mylogic m1=new mylogic(c);
	mylogic m2=new mylogic(c);

	m.start();
	m1.start();
	m2.start();
	
}
}
