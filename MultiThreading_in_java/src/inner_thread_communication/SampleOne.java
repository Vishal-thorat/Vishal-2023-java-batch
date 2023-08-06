package inner_thread_communication;

class Sum extends Thread{
	int s=0;
	
	@Override
	public void run() {
		for (int i=1;i<=10;i++) {
			s=s+i;            //1 to 10 number addition =55
		}  
	}
	public void printResult() {   //common class
		try {
			Thread.sleep(200);
		}catch(Exception e) {}
		
		System.out.println(s);
	}
	public void add() {
		// TODO Auto-generated method stub
		
	}
}

class ChildThread extends Thread{
	public Sum s;
	
	ChildThread(Sum s){
		this.s=s;
	}
	@Override
	public void run() {  //child thread call
		s.add();
	}
}


public class SampleOne {
public static void main(String[] args) {
	//Sum s=new Sum();  //sum ka object banaya mahnje thread ka object banaya --because of extended --birth
	//s.start(); //child thread banata hai
	
	//s.printResult();  //kon call karega --main call karto
	
	
	Sum s=new Sum();
	
	ChildThread c=new ChildThread(s);
	c.start();
	s.printResult();  //main  -parent thread call
}
}
