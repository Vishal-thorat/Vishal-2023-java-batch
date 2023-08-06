package constructor.examples;

public class Controller {
	
	public static void main(String[] args) {
		Test t=new Test();
		System.out.println(t.a);
		System.out.println(t.b);  //10,20
		
		Test t1 =new Test(100,200);
		System.out.println(t1.a);
		System.out.println(t1.b);  //100,200
		
		//if there any one constructor in your class then compiler is not responsible to add constructor in your class
	}

}
