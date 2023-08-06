package example.poly.co.in;

public class HoldObjectchild { 
	
	void m1(Object o)
	{
		System.out.println("m1(Object)");
	}
	void m1(Number o)
	{
		System.out.println("m1(Number)");
	}
	void m1(Float o)
	{
		System.out.println("m1(Float)");
	}
	
	void m1(String o)
	{
		System.out.println("m1(String )");
	}
	
	public static void main(String[] args) {
		HoldObjectchild h=new HoldObjectchild();
		h.m1("");
		
		h.m1(new String());
		h.m1(new String (""));
		
		h.m1(h);
		h.m1(new Integer(10));
		h.m1(new StringBuffer());
		
	}
}
