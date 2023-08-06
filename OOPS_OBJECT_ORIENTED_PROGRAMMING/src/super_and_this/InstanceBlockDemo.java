package super_and_this;

public class InstanceBlockDemo {
	public InstanceBlockDemo() {
		System.out.println("I am constructor");   //property initization first instance block execute and then constructor call
	}
	static {
		System.out.println("I am static block 1");
	}
	{
		System.out.println("I am instance Block 1");
	}

	
	public static void main(String[] args) {
		System.out.println("I am main method ");
		InstanceBlockDemo i=new InstanceBlockDemo();
		System.out.println("I object creation over");
		System.out.println("-----------------");
		InstanceBlockDemo i1=new InstanceBlockDemo();
	}
	{
		System.out.println("I am instance block 2");
	}
	static {
		System.out.println("I am static block 2");
	}
}
