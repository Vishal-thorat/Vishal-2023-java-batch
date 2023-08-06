package inner_thread_communication;

class Sums {
	int s=0;
	public void add() {
		
        int local=0;
		for (int i=1;i<=10;i++) {
			local = local+i;             //55o/p
		} 
		s=local;
		synchronized (this) {
		this.notify();
		}
		
	}
	public void printResult() {   
		if(s==0) {
			synchronized (this) {
             try {
            	 this.wait(1000);  ///upi payment of college go timer to make payment
             }catch(Exception e) {}
			}
		}
		
		System.out.println(s);
	}
}

class ChildThread1 extends Thread{
	public Sums s;
	
	public ChildThread1(Sums s){
		this.s=s;
	}

	public void run() {  //child thread call
		s.add();
	}
}


public class SampleSecond {
public static void main(String[] args) {
	Sums s=new Sums();
	
	ChildThread1 c=new ChildThread1(s);
	c.start();
	s.printResult();  
}
}
