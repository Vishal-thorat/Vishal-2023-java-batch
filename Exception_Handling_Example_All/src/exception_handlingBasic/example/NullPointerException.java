package exception_handlingBasic.example;

class Student{
	void show() {
		System.out.println("Hello");
	}
}
public class NullPointerException {
	public static void main(String[] args) {
		
		//Student s=new Student();
	//	Student s=null;  //   java.lang.NullPointerException   --runtime work and made
	//	s.show();
		//String str=null;
		
		
		
		Printdata p=new Printdata();
		p.printdata(null);
		
	}

}
