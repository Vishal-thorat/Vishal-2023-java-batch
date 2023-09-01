package externalizable.example;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ConvertObjectofFile {
public static void main(String[] args) throws Exception {
	
	Student s=new Student(23, "mr vishal", "kesanand wagholi");
	
	FileOutputStream file =new FileOutputStream("Student1.txt");
	ObjectOutputStream obj=new ObjectOutputStream(file);
	obj.writeObject(s);
	System.out.println("here we are converted whole object into file format");
	
}
}
