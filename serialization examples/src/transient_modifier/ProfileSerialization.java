package transient_modifier;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import serialization.example.Address;

public class ProfileSerialization {
	public static void main(String[] args) throws Exception {

		Profile p = new Profile();
		p.username = "test";
		p.password = "123456";
		Profile.email="vishal123@gmailcom";
		
		FileOutputStream file = new FileOutputStream("userlogin_info.txt");

		ObjectOutputStream obj = new ObjectOutputStream(file);

		obj.writeObject(p);

		System.out.println("done");
	}
}
