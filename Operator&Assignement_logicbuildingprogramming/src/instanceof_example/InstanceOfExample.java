package instanceof_example;


class A{
	
}

class B extends A{
	
}

class C{
	
}

public class InstanceOfExample {             // In that case relationship between them
public static void main(String[] args) {
	
	A a=new A();
	
	boolean f=a instanceof A;
	System.out.println(f);
	
	boolean f1=a instanceof B;
	System.out.println(f1);
	
//	boolean f2=a instanceof C;
//	System.out.println(f2);
		
}
}
