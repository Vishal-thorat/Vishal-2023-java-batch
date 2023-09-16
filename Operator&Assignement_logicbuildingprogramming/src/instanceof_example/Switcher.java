package instanceof_example;

public class Switcher {

//	void m1(){
//		
//		AA a=new AA();
//		a.testme();
//		
//		BB b=new BB();
//		b.Myself();
//		
//		CC c=new CC();
//		c.testI();
//	}
	
	
void m1(Object o){    //Object 0=new CC();
		
	if(o instanceof AA) {
		AA a= (AA)o; 
		a.testme();
	}	
	
	if(o instanceof BB) {
	BB b= (BB)o;
		b.Myself();
	}
	if(o instanceof CC) {
		CC c= (CC)o;
		c.testI();
	}
	}
	
	
	
	
	
	
	
	
}
	
	
	class AA{
	void testme() {
		System.out.println("I am AA class tesme method");
	}
	}
	
	
	class BB{
		void Myself() {
			System.out.println("I am BB class Myself method");
		}
		}
	
	class CC{
		void testI() {
			System.out.println("I am CC class testI method");
		}
		}

