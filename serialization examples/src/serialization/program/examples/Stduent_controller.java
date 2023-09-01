package serialization.program.examples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Stduent_controller {

	public static void main(String[] args)throws Exception {
		
		//serialization obj --to file
		
		Student s=new Student();
		s.firstname="saurabh";
		s.lastname="wagh";
		s.rollnumber=96;
		
		FileOutputStream file=new FileOutputStream("Student.txt");
		
		// ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream("Student.txt"));
		
		ObjectOutputStream obj=new ObjectOutputStream(file);
		obj.writeObject(s);
		
		
		//de- serialization file --to obj --but file ready exsting in folder
		
		FileInputStream input=new FileInputStream("Student.txt");
		ObjectInputStream obj1=new ObjectInputStream(input);
		
		Student s1=(Student)obj1.readObject(); 
		
		System.out.println(s1.firstname);
		System.out.println(s1.lastname);
		System.out.println(s1.rollnumber);
		
		
		
		
	}
}
