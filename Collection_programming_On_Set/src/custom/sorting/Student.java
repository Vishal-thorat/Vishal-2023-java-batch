package custom.sorting;

public class Student {

	
	private Integer rollNumber;
	private String studentName;
	
	public  Student() {}

	@Override
	public boolean equals(Object obj) {
		Student s=(Student)obj;
		if(this.getRollNumber().equals(s.getRollNumber()) && this.getStudentName().equals(s.getStudentName())){
			return true;
		}
		return false;
	}
	
	
	public Student(Integer rollNumber, String studentName) {
		
		this.rollNumber = rollNumber;
		this.studentName = studentName;
	}
	
	
	

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + "]";
	}

	public Integer getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	

	
	
}
