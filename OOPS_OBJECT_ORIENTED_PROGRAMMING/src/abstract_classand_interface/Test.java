package abstract_classand_interface;

abstract class AA{
	int a;
	int b;
	
	public AA(int a,int b) {                     ///Abstract class examples
		
	}
}
interface BB{
	final  static public int a=10;   //no intialiseer ,not object creation done ,access anyone
	abstract void m1();
	public void m2();
	}
public class Test implements BB {
  public void m1() {
	  
  }
  public void m2() {}
}
