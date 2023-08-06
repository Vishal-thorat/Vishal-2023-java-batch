package super_and_this;

class Karnataka{
	int a;
	int b;
	
	public Karnataka() {
		super();//goes upto object flow goes from upper to lower i.e first karnatak  and then maharshtra 
		int a=100;
		System.out.println("Belgoan belongs to karnatak");
	}
}
class Maharashta extends Karnataka{   //inheritance access   child karto tar parent pan call karne
	public Maharashta() {
		super();
		System.out.println("Belgoan belongs to maharashtra ");
	}
	
//	public Maharashta() {   //default constructor
//		
//	}
}

public class Constructor {
   public static void main(String[] args) {
	   Maharashta m=new Maharashta();
	   System.out.println(m.a);   // 0
	 
}
}
