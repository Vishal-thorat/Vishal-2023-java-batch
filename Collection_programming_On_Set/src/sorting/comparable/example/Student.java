package sorting.comparable.example;

public class Student implements Comparable <Student> {

	
	private Integer rollNumber;
	private String firstName;
	private String lastName;
	
	public Student() {}

	public Student(Integer rollNumber, String firstName, String lastName) {
		super();
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Integer getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public int hashCode() {
		return this.getRollNumber().hashCode() +this.getFirstName().hashCode() +this.getLastName().hashCode();
	}
	
	

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Student s1=(Student)obj;
		
		if(
		this.getRollNumber().equals(s1.getRollNumber())
		&& this.getFirstName().equals(s1.getFirstName())
		&& this.getLastName().equals(s1.getLastName())
	) {
		return true;
	}
	return false;
}
	
	public int compareTo(Student o) {
		Integer i1=this.getRollNumber();
		Integer i2=o.getRollNumber();
		
		
		int i=i1.compareTo(i2); //DSNO
		if(i==0) {
			if(this.equals(o)) {
			}
		}
		//natural order processing      acending descending
//		if(i1<i2) {
//			return +1;
//		}else if(i1>i2) {
//			return  -1;
//		}else
//		{
//			if(this.equals(o)) {
//				return 0;
//			}else {
//				return +1;
//			}
//		}
		
		
	}
	
}

