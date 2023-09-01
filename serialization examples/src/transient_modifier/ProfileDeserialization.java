package transient_modifier;

import java.io.FileInputStream;
import java.io.ObjectInputStream;



public class ProfileDeserialization {
public static void main(String[] data)throws Exception {
	
	FileInputStream file=new FileInputStream("userlogin_info.txt");
	ObjectInputStream obj=new ObjectInputStream(file);
	
	Profile p=(Profile)obj.readObject();
	
	System.out.println(p.username);
	System.out.println(p.password);
	System.out.println(Profile.email);   //static property is not part of that object
}
}
