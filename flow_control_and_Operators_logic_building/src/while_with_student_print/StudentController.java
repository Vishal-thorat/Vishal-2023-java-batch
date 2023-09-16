package while_with_student_print;

public class StudentController {
	public static void main(String[] args) {
		
		Student[] arr=new Student[3];
		
		Student s=new Student(11,"A");
		arr[0]=s;
		
		// 1 st index value
		Student s1=new Student();
		s1.setName("Mahesh");
		s1.setRollNumber(22);
		arr[1]=s1;
		
		//2nd index value
		
		arr[2]=new Student(33,"C");
		
		
		int i=0;
		while(i<arr.length) {
			System.out.println(arr[i].getName());
			System.out.println(arr[i].getRollNumber());
			i++;
		}
		
		
	}

}