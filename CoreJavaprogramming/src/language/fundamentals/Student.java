package language.fundamentals;

public class Student {
	
	int rollNumber;
	String name;
	
	Student(int rollNumber,String name){
		this.rollNumber=rollNumber;
		this.name=name;
	}
      
	
	
	public static void main(String[] args) {
		
		Student s=new Student(32,"vishal");
		System.out.println(s.rollNumber);
		System.out.println(s.name);
	}
}
