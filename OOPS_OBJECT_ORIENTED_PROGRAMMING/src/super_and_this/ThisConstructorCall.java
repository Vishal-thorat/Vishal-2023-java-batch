package super_and_this;


class KK{
	KK(){
		this(10);
		System.out.println("0");
	}
	KK(int a){
		this(10,20);
		System.out.println("1");
	}
	KK(int a,int b){
		System.out.println("2");
	}
}
public class ThisConstructorCall {
  public static void main(String[] args) {
	  KK k =new KK();
	  System.out.println("----------");
	  KK k1 =new KK(10);
	  System.out.println("----------");
	  KK k2 =new KK(10,20);
}
  
}
