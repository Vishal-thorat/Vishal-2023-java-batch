package while_student_array_operation;

public class Controller {
  public static void main(String[] args) {
	

	Employee[] arr=new Employee[4];
     
	Employee e1=new Employee();
	e1.setEmployeeName("akash");
	e1.setEmployeeNumber(25);
	e1.setEmployeeSalary(245612.00);
	arr[0]=e1;
	
	//------------------
	Employee e2=new Employee(26, "Saurabh", 325642.00);
	arr[1]=e2;
	
	//------------------------
	
	arr[2]=new Employee(29, "Ganesh", 5050000.00);
	
			
	//--------------------
	arr[3]=new Employee();
	arr[3].setEmployeeName("Vishal");
	arr[3].setEmployeeNumber(45);
	arr[3].setEmployeeSalary(1000000.00);
	
	System.out.println("Before salary Increment");   
	PrinterUtility.print(arr);
	
	
	//Do salary increased by 10 %
	System.out.println("after salary Increment");   
	PrinterUtility.print(arr);
	
}
}