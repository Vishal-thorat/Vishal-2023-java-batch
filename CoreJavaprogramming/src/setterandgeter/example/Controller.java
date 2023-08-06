package setterandgeter.example;

public class Controller {
	
	public static void main(String[] args) {
		
		A a=new A();
		int data1=a.getX();
		System.out.println(data1);
		int data2=a.getY();
		System.out.println(data2);
	
	//--------------------------------
		A a1=new A();
		
		a1.setX(100);
		a1.setY(200);
		
		int data3=a1.getX();
		int data4=a1.getY();
		
		System.out.println(data3);
		System.out.println(data4);
		
		
	}
	

}
