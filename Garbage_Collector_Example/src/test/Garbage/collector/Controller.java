package test.Garbage.collector;

public class Controller {
public static void main(String[] args)throws Exception {
	Runtime r=Runtime.getRuntime();
	//Check memory
	System.out.print(r.freeMemory());
	Test t=new Test();
	Test t1=new Test();
	Test t2=new Test();
	Test t3=new Test();
	Test t4=new Test();
	r.gc();
	
	t1=null;
	t3=null;
	t2=null;
	t4=null;
	
	Test t65=new Test();
	Test t4651=new Test();
	Test t45622=new Test();
	Test t2213=new Test();
	Test t4556=new Test();
	
	Thread.currentThread().sleep(1000);
	System.out.println(r.freeMemory());
	
	
}
}
