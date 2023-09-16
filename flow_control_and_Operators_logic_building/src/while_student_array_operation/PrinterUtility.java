package while_student_array_operation;

public class PrinterUtility {
 
	public static void print(Employee[]arr) {
		
		int index=0;
		
		while(index<arr.length) {
			System.out.println(arr[index].getEmployeeNumber());
			System.out.println(arr[index].getEmployeeName());
			System.out.println(arr[index].getEmployeeSalary());
			
			index++;
			System.out.println("----------------------");
		}
	}
}
