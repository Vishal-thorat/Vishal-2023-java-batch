package exception_handlingBasic.example;


class Employee{
	void PrintEmployeeInfo() {
		System.out.println("INFO");
	}
	
	static Employee getObject() {
		return null;
	}
}





public class UnMatchExceptionHandling {
	
	public static void main(String[] args) {
		System.out.println("Start");
		
		Employee e=Employee.getObject();
		try {
			e.PrintEmployeeInfo();          //java.lang.NullPointerException
		} 
		catch(Throwable e1) {
			System.out.println(e1);   //No exception of type NullPointerException can be thrown; an exception type must be a subclass of Throwable
		}
		System.out.println("end");
		}

}
