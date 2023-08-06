package method.Overriding.examples;

import method.Overriding.examples.Parent.Child;

public class Controller {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.m1(10);
		p.m1(25);
//
//		Child c=new Child();  //error occure please fix error
//	c.m1(1000);
		
		Parent p1 = new Parent();
		p1.m1(10);
		
	}
}
