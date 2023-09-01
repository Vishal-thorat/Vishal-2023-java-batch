package externalizable.example;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Student implements Externalizable {

	private Integer rollNumber;
	private String name;
	private String address;
	
	public Student() {
		System.out.println("I am deserialization");
	}

	public Student(Integer rollNumber, String name, String address) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.address = address;
	}

	public Integer getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", address=" + address + "]";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		System.out.println("I am write External method");
		out.writeObject(rollNumber);
		out.writeObject(name);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		System.out.println("I am read External method");
	// Integer rollno=(Integer)in.readObject();
	  //rollNumber=rollno;
	  //we can do like that  aslo used this.
	  rollNumber=(Integer)in.readObject();
	  //System.out.println(">>>>>>"+rollno);
		
	  name= (String)in.readObject();
	}
	
	
	
}
