package type.of.varaible.statc;

public class Controller {
	
	public static void main(String[] args) {
		
		Student s=new Student();
		s.rollNumber=12;
		s.name="prathmesh";
		//s.schoolName="BGS";  //The static field Student.schoolName should be accessed in a static way

		Student.schoolName ="MK";
		
		Student s1=new Student();
		s1.rollNumber=24;
		s1.name="karthik";
		
		
		//System.out.println(s1.schoolName);
		System.out.println(Student.schoolName);
		
		
		Student.schoolName ="JK";
		
//		System.out.println(s.schoolName);
//		System.out.println(s1.schoolName);
		
		System.out.println(Student.schoolName);
	}

}
