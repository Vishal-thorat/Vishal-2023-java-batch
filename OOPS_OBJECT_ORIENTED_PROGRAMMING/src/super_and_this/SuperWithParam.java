package super_and_this;

class P{
	//P(){}
	public P(String msg){
		System.out.println(msg);
	}
}
class C extends P{
	public C(String c1,String P1) {
		super("P1");
		System.out.println(c1);
	}

}
public class SuperWithParam {
public static void main(String[] args) {
	 C c=new C("Child data","parent data");
}
 
}
//notw