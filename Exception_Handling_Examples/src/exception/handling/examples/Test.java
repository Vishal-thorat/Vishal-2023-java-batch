package exception.handling.examples;

class KGF{
	public String message() {
		return "confidence";
	}
}
public class Test {
	public static void main(String[] args) {
		
		KGF kgf=new KGF();
		
		System.out.println("start");
		System.out.println("step 1");
		//int a=10/0;
		String r=kgf.message();
		System.out.println(r);
		System.out.println("step 2");
		System.out.println("step 3");
		System.out.println("end");
	}

}
