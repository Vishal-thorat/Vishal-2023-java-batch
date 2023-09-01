package test.Garbage.collector;

public class Control {
public static void main(String[] args) {
	
	Test t1=new Test();
	t1=null;
	System.gc();  //thread occured
	System.out.println("<<<<<<<<<<<<<<<");
	
}
}
