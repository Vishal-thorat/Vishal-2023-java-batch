package thread.priority.examples;

//important example  very intresting

class Jobs extends Thread{
	
	Thread parent;
	Jobs(Thread parent){
		this.parent=parent;
	}
	
	
	@Override
	public void run() {
	for (int i=0;i<100;i++) {
		System.out.println(Thread.currentThread().getName());
		//Thread.yield();  //stop and give chance to other
		try {
			
		
		if(i==3)
		this.parent.join();
		}
		catch(Exception e) {
			
		}
	}
	}
}

public class JoinCall {
public static void main(String[] args)throws Exception {
	
	Thread parent=Thread.currentThread();
	
	Jobs j=new Jobs(parent);  //j is for child
	j.start();
	for (int i=1;i<=100;i++) {
		System.out.println(Thread.currentThread().getName());
//		if(i==5)
//		j.join();  //mere current exceution khatam karo ani jisko bola hai  join usko bolo complete karo fir mere pass ayo
	}
	
}

}
